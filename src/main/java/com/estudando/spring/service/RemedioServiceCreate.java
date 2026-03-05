package com.estudando.spring.service;

import com.estudando.spring.dtos.RemedioDTOCreate;
import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.RemedioModel;
import com.estudando.spring.entity.Via;
import com.estudando.spring.exception.RemedioDuplicadoException;
import com.estudando.spring.mapper.RemedioMapper;
import com.estudando.spring.repository.RemedioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemedioServiceCreate {

    @Autowired
    private final RemedioRepository repository;

    public RemedioServiceCreate(RemedioRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public RemedioModel cadastrar(RemedioDTOCreate dto) {
        verificarRemedioExistente(dto.nome(), dto.via(), dto.laboratorio());
        RemedioModel remedio = RemedioMapper.toEntity(dto);
        return repository.save(remedio);
    }

    private void verificarRemedioExistente(String nome, Via via, Laboratorio laboratorio){
        boolean exists = repository.existsByNomeAndViaAndLaboratorio(nome, via, laboratorio);

        if (exists) {
            throw new RemedioDuplicadoException(
                    "Já existe um remédio com o mesmo nome, via e laboratório."
            );
        }
    }

}
