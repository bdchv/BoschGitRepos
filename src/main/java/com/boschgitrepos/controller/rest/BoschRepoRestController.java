package com.boschgitrepos.controller.rest;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.serveice.contract.BoschService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/repos")
public class BoschRepoRestController {

    private final BoschService boschService;

    @Autowired
    public BoschRepoRestController(BoschService boschService) {
        this.boschService = boschService;
    }


    @GetMapping("/")
    public List<BoschRepo> getAllRepos(){
        return boschService.getAll();
    }

}
