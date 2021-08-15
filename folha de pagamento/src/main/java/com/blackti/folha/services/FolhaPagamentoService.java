package com.blackti.folha.services;


import com.blackti.folha.entities.FolhaPagamento;
import com.blackti.folha.entities.Trabalhador;
import com.blackti.folha.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolhaPagamentoService {

    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;

    public FolhaPagamento getPagamento (long trabalhadorId, int dias){

        Trabalhador trabalhador = trabalhadorFeignClient.findById(trabalhadorId).getBody();

        return new FolhaPagamento(trabalhador.getNome(), trabalhador.getRendaDiaria(), dias);
    }
}
