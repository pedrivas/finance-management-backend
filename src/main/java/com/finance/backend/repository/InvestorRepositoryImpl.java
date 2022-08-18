package com.finance.backend.repository;

import com.finance.backend.models.Investor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvestorRepositoryImpl {

    @Autowired
    @Lazy
    InvestorRepository investorRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Investor> getIdGreaterThan3() {

        //em.createQuery(yourCriteria);

        return investorRepository.findAll().stream().filter(investor -> investor.getId() > 3L).collect(Collectors.toList());


    }
}
