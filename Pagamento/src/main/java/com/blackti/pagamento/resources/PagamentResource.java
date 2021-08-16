package com.blackti.pagamento.resources;

import com.blackti.pagamento.entities.Pagamento;
import com.blackti.pagamento.services.PagamentoService;
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
public class PagamentResource {

    private static Logger logger = LoggerFactory.getLogger(PagamentResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> findById(@PathVariable Long trabalhadorId, @PathVariable Integer dias) {

        logger.info("PORT = " + env.getProperty("local.server.port"));

        Pagamento obj = pagamentoService.getPagamento(trabalhadorId, dias);
        return ResponseEntity.ok(obj);
    }
}
