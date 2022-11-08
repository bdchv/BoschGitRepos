package com.boschgitrepos.models.dto;

public class RepoDto {

    private String name;
    private String description;
    private String language;

    public RepoDto() {
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
