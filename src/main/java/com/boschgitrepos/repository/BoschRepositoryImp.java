package com.boschgitrepos.repository;
import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.repository.contract.BoschRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;


public class BoschRepositoryImp implements BoschRepository {

    private final SessionFactory sessionFactory;
    private final List<BoschRepo> repos;

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
}
