package com.finance.backend.repository;

import com.finance.backend.models.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Investor, Long>, InvestorRepositoryCustom {

    //public List<Investor> findByIdGreaterThan(Long id);
    //public List<Provedora>  findByFundacaoBetweenAndNomeStartingWith(Date dataInicial, Date dataFinal,String nome );


}
