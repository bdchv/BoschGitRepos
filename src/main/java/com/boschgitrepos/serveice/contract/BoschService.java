package com.boschgitrepos.serveice.contract;

import com.boschgitrepos.models.BoschRepo;
import com.boschgitrepos.models.FilterOptions;

import java.util.List;

public interface BoschService {

     List<BoschRepo> getAll();

     List<BoschRepo> filter (FilterOptions filterOptions);
}
