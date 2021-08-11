package com.blackti.rh.resources;


import com.blackti.rh.entities.Trabalhador;
import com.blackti.rh.services.TrabalhadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/trabalhador")
public class TrabalhadorResource {

    @Autowired
    private TrabalhadorService trabalhadorService;

    @GetMapping
    public ResponseEntity<Page<Trabalhador>> findAll(@PageableDefault Pageable pageable) {
        Page<Trabalhador> list = trabalhadorService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id) {
        Trabalhador obj = trabalhadorService.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
