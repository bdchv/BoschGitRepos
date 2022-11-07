package com.boschgitrepos.repository.contract;

import com.boschgitrepos.models.BoschRepo;

import java.util.List;

public interface Repository {

    List<BoschRepo> get();

}
