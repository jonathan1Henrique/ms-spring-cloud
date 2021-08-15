package com.blackti.folha.resources;

import com.blackti.folha.entities.FolhaPagamento;
import com.blackti.folha.services.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pagamento")
public class FolhaPagamentResource {


    @Autowired
    private FolhaPagamentoService folhaPagamentoService;

    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<FolhaPagamento> findById(@PathVariable Long trabalhadorId, @PathVariable Integer dias) {
        FolhaPagamento obj = folhaPagamentoService.getPagamento(trabalhadorId, dias);
        return ResponseEntity.ok(obj);
    }
}
