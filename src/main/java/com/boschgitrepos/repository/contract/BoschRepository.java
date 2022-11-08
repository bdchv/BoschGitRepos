package com.boschgitrepos.repository.contract;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.models.FilterOptions;

import java.util.List;

public interface BoschRepository {

    List<BoschRepo> getAll();

    List<BoschRepo> filter (FilterOptions filterOptions);

}
