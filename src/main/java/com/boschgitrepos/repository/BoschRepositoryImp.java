package com.boschgitrepos.repository;
import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.models.FilterOptions;
import com.boschgitrepos.repository.contract.BoschRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoschRepositoryImp implements BoschRepository {

    private final SessionFactory sessionFactory;
    private final List<BoschRepo> repos;

    @Autowired
    public BoschRepositoryImp(SessionFactory sessionFactory, List<BoschRepo> repos) {
        this.sessionFactory = sessionFactory;
        this.repos = repos;
    }


    @Override
    public List<BoschRepo> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<BoschRepo> query = session.createQuery("from BoschRepo", BoschRepo.class);
            return query.list();
        }
    }


    public List<BoschRepo> filter (FilterOptions filterOptions){
        try(Session session = sessionFactory.openSession()){
            StringBuilder queryString = new StringBuilder("from BoschRepo where 1=1");
            if (filterOptions.getName().isPresent()) {
                queryString.append(" and name like :name");
            }
            if (filterOptions.getDescription().isPresent()) {
                queryString.append(" and description like :description");
            }
            if (filterOptions.getLanguage().isPresent()) {
                queryString.append(" and language like :language");
            }

            Query<BoschRepo> query = session.createQuery(queryString.toString(), BoschRepo.class);
            if (filterOptions.getName().isPresent()) {
                query.setParameter("name", filterOptions.getName().get());
            }
            if (filterOptions.getDescription().isPresent()) {
                query.setParameter("description", filterOptions.getDescription().get());
            }
            if (filterOptions.getLanguage().isPresent()) {
                query.setParameter("language", filterOptions.parseStringToEnum(filterOptions.getLanguage().get()));
            }

            return query.list();
        }
    }
}
