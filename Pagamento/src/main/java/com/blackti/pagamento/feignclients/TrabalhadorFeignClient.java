package com.blackti.pagamento.feignclients;

import com.blackti.pagamento.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "rh", path = "/trabalhador")
public interface TrabalhadorFeignClient  {

    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}
