package com.blackti.rh.services;

import com.blackti.rh.entities.Trabalhador;
import com.blackti.rh.repositories.TrabalhadorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TrabalhadorService {

    @Autowired
    private TrabalhadorRepository trabalhadorRepository;

    public Page<Trabalhador> findAll(Pageable pageable){
        return trabalhadorRepository.findAll(pageable);

    }

    public Optional<Trabalhador> findById(Long id){
        return trabalhadorRepository.findById(id);

    }
}
