package com.blackti.pagamento.resources;

import com.blackti.pagamento.entities.Pagamento;
import com.blackti.pagamento.services.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
public class PagamentoResource {

    private static Logger logger = LoggerFactory.getLogger(PagamentoResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private PagamentoService pagamentoService;

    @HystrixCommand(fallbackMethod = "findByIdAlternative")
    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> findById(@PathVariable Long trabalhadorId, @PathVariable Integer dias) throws Exception{

//        int x = 1;

//        if( x == 1 ){
//            throw new Exception();
//        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Pagamento obj = pagamentoService.getPagamento(trabalhadorId, dias);
        return ResponseEntity.ok(obj);
    }

    public ResponseEntity<Pagamento> findByIdAlternative(Long trabalhadorId,Integer dias){

        return ResponseEntity.ok(pagamentoService.getTesteAlternativeMethod(trabalhadorId, dias));
    }
}
