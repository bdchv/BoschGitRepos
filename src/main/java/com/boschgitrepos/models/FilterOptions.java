package com.boschgitrepos.models;

import com.boschgitrepos.models.enums.Language;

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

    public Language parseStringToEnum(String str){
        try {
            return Language.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("No such element", str));
        }
    }

}
