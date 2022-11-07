package com.boschgitrepos.controller;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.repository.contract.BoschRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/repos")
public class BoschRepoMvcController {

    private final BoschRepository boschRepository;

    @Autowired
    public BoschRepoMvcController(BoschRepository boschRepository) {
        this.boschRepository = boschRepository;
    }

    @GetMapping
    public String showAllRepos(Model model){
        List<BoschRepo> repos = boschRepository.getAll();
        model.addAttribute("boschRepos",repos);
        return "allRepos";
    }


}
