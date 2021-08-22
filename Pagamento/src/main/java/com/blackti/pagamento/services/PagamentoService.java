package com.blackti.pagamento.services;


import com.blackti.pagamento.entities.Pagamento;
import com.blackti.pagamento.entities.Trabalhador;
import com.blackti.pagamento.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;

    public Pagamento getPagamento (long trabalhadorId, int dias){

        Trabalhador trabalhador = trabalhadorFeignClient.findById(trabalhadorId).getBody();

        return new Pagamento(trabalhador.getNome(), trabalhador.getRendaDiaria(), dias);
    }

    public Pagamento getTesteAlternativeMethod (long trabalhadorId, int dias){

        return new Pagamento("Teste", 300.0, dias);
    }
}
