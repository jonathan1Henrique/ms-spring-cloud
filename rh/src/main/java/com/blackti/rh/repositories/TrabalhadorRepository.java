package com.blackti.rh.repositories;

import com.blackti.rh.entities.Trabalhador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhadorRepository extends PagingAndSortingRepository<Trabalhador, Long> {
}
