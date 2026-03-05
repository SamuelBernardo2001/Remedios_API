package com.estudando.spring.service;

import com.estudando.spring.dtos.RemedioResponseDTO;
import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.Via;
import com.estudando.spring.mapper.RemedioMapper;
import com.estudando.spring.repository.RemedioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemedioServiceList {

    private final RemedioRepository repository;

    public RemedioServiceList(RemedioRepository repository) {
        this.repository = repository;
    }

    public List<RemedioResponseDTO> listarRemedios() {
        return repository.findAll()
                .stream()
                .map(RemedioMapper::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(RemedioMapper::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorVia(Via via) {
        return repository.findByVia(via)
                .stream()
                .map(RemedioMapper::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorLaboratorio(Laboratorio laboratorio) {
        return repository.findByLaboratorio(laboratorio)
                .stream()
                .map(RemedioMapper::toDTO)
                .toList();
    }
}