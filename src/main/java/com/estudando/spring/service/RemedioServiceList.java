package com.estudando.spring.service;

import com.estudando.spring.dtos.RemedioResponseDTO;
import com.estudando.spring.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemedioServiceList {

    @Autowired
    private final RemedioRepository repository;

    public RemedioServiceList(RemedioRepository repository) {
        this.repository = repository;
    }

    public List<RemedioResponseDTO> listarRemedios() {
        return repository.findAll().stream()
                .map(remedio -> new RemedioResponseDTO(
                        remedio.getId(),
                        remedio.getNome(),
                        remedio.getVia(),
                        remedio.getLote(),
                        remedio.getValidade(),
                        remedio.getQuantidade(),
                        remedio.getLaboratorio()
                ))
                .toList();
    }
}
