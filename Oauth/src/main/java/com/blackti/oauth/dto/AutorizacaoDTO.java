package com.blackti.oauth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AutorizacaoDTO {

    private static final long serialVersionUID = 1L;

    private Long id;
    @EqualsAndHashCode.Include
    private String autorizacao;
}
