package com.estudando.spring.controllers;

import com.estudando.spring.dtos.RemedioDTOCreate;
import com.estudando.spring.dtos.RemedioResponseDTO;
import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.RemedioModel;
import com.estudando.spring.service.RemedioServiceCreate;
import com.estudando.spring.service.RemedioServiceList;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    private final RemedioServiceCreate service;
    private final RemedioServiceList serviceList;


    public RemedioController(RemedioServiceCreate service, RemedioServiceList serviceList) {
        this.service = service;
        this.serviceList = serviceList;
    }

    @PostMapping("/cadastrar")
    @Transactional
    public ResponseEntity<RemedioModel> cadastrarRemedio(@RequestBody @Valid RemedioDTOCreate dto) {
        RemedioModel salvo = service.cadastrar(dto);
        return ResponseEntity.status(201).body(salvo);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<RemedioResponseDTO>> listarRemedios() {
        List<RemedioResponseDTO> lista = serviceList.listarRemedios();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/buscar-por-nome")
    public ResponseEntity<List<RemedioResponseDTO>> buscarRemediosPorNome(@RequestParam String nome) {
        List<RemedioResponseDTO> lista = serviceList.buscarRemediosPorNome(nome);
        return ResponseEntity.ok(lista);
    }

    public ResponseEntity<List<RemedioResponseDTO>> buscarRemediosPorLaboratorio(@RequestParam Laboratorio laboratorio) {
        List<RemedioResponseDTO> lista = serviceList.buscarRemediosPorLaboratorio(laboratorio);
        return ResponseEntity.ok(lista);
    }

}
