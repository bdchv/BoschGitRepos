package com.boschgitrepos.models.dto;

import com.boschgitrepos.models.enums.Language;

public class RepoDto {

    private String name;
    private String description;
    private String language;

    public RepoDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
