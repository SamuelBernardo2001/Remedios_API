package com.estudando.spring.dtos;

import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.Via;

import java.time.LocalDate;

public record RemedioDTOCreate(
        String nome,
        Via via,
        String lote,
        LocalDate validade,
        int quantidade,
        Laboratorio laboratorio) {
}