package com.boschgitrepos.controller.mvc;

import com.boschgitrepos.mapper.RepoMapper;
import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.models.FilterOptions;
import com.boschgitrepos.models.dto.RepoDto;
import com.boschgitrepos.serveice.contract.BoschService;
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

    private final BoschService boschService;

    private final RepoMapper repoMapper;

    @Autowired
    public BoschRepoMvcController(BoschService boschService, RepoMapper repoMapper) {
        this.boschService = boschService;
        this.repoMapper = repoMapper;
    }



    @GetMapping
    public String showAllRepos(@ModelAttribute("filterOptions") RepoDto dto, Model model){
        FilterOptions filterOptions = repoMapper.fromFilterDto(dto);
        List<BoschRepo> repoList = boschService.filter(filterOptions);
        model.addAttribute("filterOptions",dto);
        model.addAttribute("boschRepos",repoList);
        return "allRepos";
    }

}
