package com.finance.backend;

import com.finance.backend.models.Investor;
import com.finance.backend.repository.InvestorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j
@EnableJpaRepositories
public class BackendApplication implements CommandLineRunner {

    @Autowired
    InvestorRepository investorRepository;


    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);

    }

    @Override
    public void run(String... args) {

        log.info("A P L I C A C A O   C A R R E G A D A");
        List<Investor> idGreaterThan3 = investorRepository.getIdGreaterThan3();
        investorRepository.save(new Investor());
        log.info(idGreaterThan3.get(0).toString());

    }

    private void delete(Long id) {
        investorRepository.deleteById(id);
    }

    private Optional<Investor> getById() {
        return investorRepository.findById(2L);
    }

    private void insert() {
        Investor investor = Investor.builder()
                .cpf("64564325")
                .name("UPDATE")
                .birthDate("1962-08-01")
                .currentPosition(0.0)
                .id(4L)
                .build();

        investorRepository.save(investor);
    }

    private void update() {
        Optional<Investor> investor = getById();
        investor.get().setName("Roger Biceps de 50cm");
        investorRepository.save(investor.get());
        //se passar o id que ja existe na tabela, tambem é possivel fazer update sem dar o get antes
    }


}
