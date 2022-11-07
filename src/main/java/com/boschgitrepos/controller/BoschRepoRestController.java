package com.boschgitrepos.controller;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.repository.contract.BoschRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;
import java.util.List;

@RestController
@RequestMapping("api/repos")
public class BoschRepoRestController {

    private final BoschRepository boschRepository;


    @Autowired
    public BoschRepoRestController(BoschRepository boschRepository) {
        this.boschRepository = boschRepository;
    }

    @GetMapping("/")
    public List<BoschRepo> getAllRepos(){
        return boschRepository.getAll();
    }

}
