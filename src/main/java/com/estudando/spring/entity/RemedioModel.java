package com.estudando.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemedioModel {

    private String nome;
    private String via;
    private String lote;
    private LocalDate validade;
    private int quantidade;
    private String laboratorio;

}
