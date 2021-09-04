package com.blackti.oauth.resources;

import com.blackti.oauth.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.blackti.oauth.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario-oauth")
public class UsuarioResouces {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/search")
    public ResponseEntity<UsuarioDTO> findByEmail(@RequestParam String email){
        try {
            return ResponseEntity.ok(service.findByEmail(email));
        }catch (IllegalAccessException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
