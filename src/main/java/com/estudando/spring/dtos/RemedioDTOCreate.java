package com.estudando.spring.dtos;

import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.Via;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record RemedioDTOCreate(

        @NotBlank(message = "O nome do remédio é obrigatório")
        String nome,

        @NotNull(message = "A via de administração do remédio é obrigatória")
        Via via,

        @NotBlank(message = "O lote do remédio é obrigatório")
        String lote,

        @NotNull (message = "A validade do remédio é obrigatória")
        LocalDate validade,

        @Min(value = 1, message = "A quantidade do remédio deve ser pelo menos 1")
        @NotNull(message = "A quantidade do remédio é obrigatória")
        Integer quantidade,

        @NotNull(message = "O laboratório do remédio é obrigatório")
        Laboratorio laboratorio) {
}