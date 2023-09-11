package com.avanade.desafio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;
    private String name;
    private BigDecimal value;
}