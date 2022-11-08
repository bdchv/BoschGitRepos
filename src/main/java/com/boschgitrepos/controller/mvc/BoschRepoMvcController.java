package com.boschgitrepos.controller.mvc;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.serveice.contract.BoschService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/repos")
public class BoschRepoMvcController {

    private final BoschService boschService;

    @Autowired
    public BoschRepoMvcController(BoschService boschService) {
        this.boschService = boschService;
    }


    @GetMapping
    public String showAllRepos(Model model){
        List<BoschRepo> repos = boschService.getAll();
        model.addAttribute("boschRepos",repos);
        return "allRepos";
    }


}
