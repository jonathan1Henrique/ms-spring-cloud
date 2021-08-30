package com.blackti.usuario.resources;

import com.blackti.usuario.entities.Usuario;
import com.blackti.usuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResources {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario obj = usuarioRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping("/search")
    public ResponseEntity<Usuario> findByEmail(@RequestParam String email) {
        Usuario obj = usuarioRepository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }
}
