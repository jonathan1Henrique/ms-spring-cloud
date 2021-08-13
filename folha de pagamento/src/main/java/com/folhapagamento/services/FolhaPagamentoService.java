package com.folhapagamento.services;

import com.folhapagamento.entities.FolhaPagamento;
import org.springframework.stereotype.Service;

@Service
public class FolhaPagamentoService {

    public FolhaPagamento getPagamento (long trabalhoId, int dias){
        return new FolhaPagamento("Bob", 200.0, dias);
    }
}
