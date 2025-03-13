package com.ozzmakappa.scea.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="espacos")

public class Espaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String sigla;

    private String nome;
    private String descricao;
    private Integer capacidade;
    private Boolean disponivel = true;

    public Espaco() {}

}
