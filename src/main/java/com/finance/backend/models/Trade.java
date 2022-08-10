package com.finance.backend.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Entity
@Table(name = "trades")
@NoArgsConstructor
@AllArgsConstructor
public class Trade {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "asset_id", referencedColumnName = "id")
    private Asset asset;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

}
