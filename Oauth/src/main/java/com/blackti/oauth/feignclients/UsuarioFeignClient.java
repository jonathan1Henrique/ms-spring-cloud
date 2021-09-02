package com.blackti.oauth.feignclients;

import com.blackti.oauth.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "usuario", path = "/usuario")
public interface UsuarioFeignClient {

    @GetMapping("/search")
    ResponseEntity<UsuarioDTO> findByEmail(@RequestParam String email);
}
