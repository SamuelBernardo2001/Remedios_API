package com.estudando.spring.dtos;

import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.Via;

import java.time.LocalDate;

public record RemedioResponseDTO(
        Long id,
        Via via,
        String nome,
        String lote,
        LocalDate validade,
        Integer quantidade,
        Laboratorio laboratorio
) {
}
