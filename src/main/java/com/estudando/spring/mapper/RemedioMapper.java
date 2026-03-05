package com.estudando.spring.mapper;

import com.estudando.spring.dtos.RemedioDTOCreate;
import com.estudando.spring.dtos.RemedioResponseDTO;
import com.estudando.spring.entity.RemedioModel;

public class RemedioMapper {

    public static RemedioModel toEntity(RemedioDTOCreate dto) {
        RemedioModel remedio = new RemedioModel();
        remedio.setNome(dto.nome());
        remedio.setVia(dto.via());
        remedio.setLote(dto.lote());
        remedio.setValidade(dto.validade());
        remedio.setQuantidade(dto.quantidade());
        remedio.setLaboratorio(dto.laboratorio());
        return remedio;
    }

    public static RemedioResponseDTO toDTO(RemedioModel remedio) {
        return new RemedioResponseDTO(
                remedio.getId(),
                remedio.getNome(),
                remedio.getVia(),
                remedio.getLote(),
                remedio.getValidade(),
                remedio.getQuantidade(),
                remedio.getLaboratorio()
        );
    }
}
