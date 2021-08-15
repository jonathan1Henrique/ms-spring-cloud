package com.blackti.folha.feignclients;

import com.blackti.folha.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "rh", url = "localhost:8001", path = "/trabalhador")
public interface TrabalhadorFeignClient  {

    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}
