package com.finance.backend.service;

import com.finance.backend.models.Investor;
import com.finance.backend.models.InvestorPostRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorService {

    @Autowired
    ModelMapper modelMapper;

    public Investor convertToInvestorEntity(InvestorPostRequest investorPostRequest) {
        return modelMapper.map(investorPostRequest, Investor.class);
    }
}
