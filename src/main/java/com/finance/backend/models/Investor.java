package com.finance.backend.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name = "investors")
@NoArgsConstructor
@AllArgsConstructor
public class Investor {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "origin", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private String birthDate;

    @Column(name = "current_position", nullable = false)
    private Double currentPosition;

    @Column(name = "cpf", nullable = false)
    private Double cpf;

}
