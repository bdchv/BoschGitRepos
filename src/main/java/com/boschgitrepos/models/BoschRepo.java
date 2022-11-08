package com.boschgitrepos.models;

import com.boschgitrepos.models.enums.Language;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bosch_repos")
public class BoschRepo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Enumerated
    @Column(name = "language")
    private Language language;
    @Column(name = "repo_url")
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
