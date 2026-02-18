package com.estudando.spring.mapper;

import com.estudando.spring.dtos.RemedioDTOCreate;
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
}
