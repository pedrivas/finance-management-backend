package com.finance.backend.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name = "assets")
@NoArgsConstructor
@AllArgsConstructor
public class Asset {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private Long name;

    @Column(name = "type", nullable = false)
    private Integer type;

}