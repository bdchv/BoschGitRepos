package com.boschgitrepos.mapper;

import com.boschgitrepos.models.FilterOptions;
import com.boschgitrepos.models.dto.RepoDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RepoMapper {

    public FilterOptions fromFilterDto(RepoDto dto){

        FilterOptions filterOptions = new FilterOptions(
                Optional.ofNullable(dto.getName()),
                Optional.ofNullable(dto.getDescription()),
                Optional.ofNullable(dto.getLanguage()));
        return filterOptions;
    }

}
