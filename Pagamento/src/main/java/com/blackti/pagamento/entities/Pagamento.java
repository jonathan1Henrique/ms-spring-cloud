package com.blackti.pagamento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento implements Serializable {

    private String nome;
    private Double rendaDiaria;
    private Integer diasTrabalhados;


    public Double getTotal(){return diasTrabalhados * rendaDiaria;}


}
