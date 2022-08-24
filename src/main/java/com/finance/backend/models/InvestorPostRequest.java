package com.finance.backend.models;

import lombok.Data;

@Data
public class InvestorPostRequest {

    private Long id;

    private String name;

    private String birthDate;

    private Double currentPosition;

    private String cpf;
}
