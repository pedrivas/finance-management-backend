package com.finance.backend.repository;

import com.finance.backend.models.Investor;

import java.util.List;

public interface InvestorRepositoryCustom {

    List<Investor> getIdGreaterThan3();

}
