package com.boschgitrepos.controller.rest;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.models.FilterOptions;
import com.boschgitrepos.serveice.contract.BoschService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @GetMapping("/filter")
    List<BoschRepo> filter (@RequestParam(required = false) Optional<String> name,
                            @RequestParam(required = false) Optional<String> description,
                            @RequestParam(required = false) Optional<String> language){

        return boschService.filter(new FilterOptions(
                name,
                description,
                language));
    }



}
