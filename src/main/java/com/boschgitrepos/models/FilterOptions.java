package com.boschgitrepos.models;

import java.util.Optional;

public class FilterOptions {


    private Optional<String> name;
    private Optional<String> description;
    private Optional<String> language;

    public FilterOptions(Optional<String> name,
                         Optional<String> description,
                         Optional<String> language) {
        this.name = name;
        this.description = description;
        this.language = language;
    }

    public Optional<String> getName() {
        return name;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public Optional<String> getLanguage() {
        return language;
    }


}
