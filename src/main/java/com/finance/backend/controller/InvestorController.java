package com.finance.backend.controller;

import com.finance.backend.models.Investor;
import com.finance.backend.models.InvestorPostRequest;
import com.finance.backend.repository.InvestorRepository;
import com.finance.backend.service.InvestorService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class InvestorController {

    @Autowired
    private final InvestorService investorService;

    @Autowired
    private final InvestorRepository investorRepository;

    @ApiOperation(value = "Search all investors.")
    @GetMapping("/investor")
    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    @GetMapping("/investor/{id}")
    public Investor getInvestorById(@PathVariable Long id) {
        return investorRepository.findById(id).orElse(null);
    }

    @PostMapping("/investor")
    @ResponseStatus(HttpStatus.CREATED)
    public Investor postInvestor(@RequestBody InvestorPostRequest investorPostRequest) {
        Investor investor = investorService.convertToInvestorEntity(investorPostRequest);
        return investorRepository.save(investor);
    }

    @DeleteMapping("investor/{id}")
    public void deleteInvestor(@PathVariable Long id) {
        investorRepository.deleteById(id);
    }


}
