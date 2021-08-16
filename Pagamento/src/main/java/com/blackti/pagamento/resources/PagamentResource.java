package com.blackti.folha.resources;

import com.blackti.folha.entities.FolhaPagamento;
import com.blackti.folha.services.FolhaPagamentoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pagamento")
public class FolhaPagamentResource {

    private static Logger logger = LoggerFactory.getLogger(FolhaPagamentResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private FolhaPagamentoService folhaPagamentoService;

    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<FolhaPagamento> findById(@PathVariable Long trabalhadorId, @PathVariable Integer dias) {

        logger.info("PORT = " + env.getProperty("local.server.port"));

        FolhaPagamento obj = folhaPagamentoService.getPagamento(trabalhadorId, dias);
        return ResponseEntity.ok(obj);
    }
}
