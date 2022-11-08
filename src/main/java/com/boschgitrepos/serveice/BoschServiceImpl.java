package com.boschgitrepos.serveice;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.repository.contract.BoschRepository;
import com.boschgitrepos.serveice.contract.BoschService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoschServiceImpl implements BoschService {


    private final BoschRepository boschRepository;

    @Autowired
    public BoschServiceImpl(BoschRepository boschRepository) {
        this.boschRepository = boschRepository;
    }

    @Override
    public List<BoschRepo> getAll() {
        return boschRepository.getAll();
    }
}
