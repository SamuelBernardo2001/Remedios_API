package com.estudando.spring.service;

import com.estudando.spring.dtos.RemedioResponseDTO;
import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.RemedioModel;
import com.estudando.spring.entity.Via;
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
                .map(this::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorVia(Via via) {
        return repository.findByVia(via)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public List<RemedioResponseDTO> buscarRemediosPorLaboratorio(Laboratorio laboratorio) {
        return repository.findByLaboratorio(laboratorio)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    private RemedioResponseDTO toDTO(RemedioModel remedio) {
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