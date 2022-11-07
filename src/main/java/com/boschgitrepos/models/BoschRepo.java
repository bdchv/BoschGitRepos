package com.boschgitrepos.models;

import com.boschgitrepos.models.enums.Language;

import java.util.Objects;

public class BoschRepo {
    private int id;
    private String name;
    private String description;
    private Language language;
    private String url;


    public BoschRepo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BoschRepo boschRepo = (BoschRepo) obj;
        return getId() == boschRepo.getId() &&
                getName().equals(boschRepo.getName());
    }
}
