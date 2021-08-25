package com.blackti.usuario.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_autorizacao")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Autorizacao implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @EqualsAndHashCode.Include
    private String autorizacao;
}
