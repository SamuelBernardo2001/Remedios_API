package com.estudando.spring.controllers;

import com.estudando.spring.dtos.RemedioDTOCreate;
import com.estudando.spring.entity.RemedioModel;
import com.estudando.spring.repository.RemedioRepository;
import com.estudando.spring.service.RemedioServiceCreate;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    private final RemedioServiceCreate service;

    public RemedioController(RemedioServiceCreate service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<RemedioModel> cadastrarRemedio(@RequestBody @Valid RemedioDTOCreate dto) {
        RemedioModel salvo = service.cadastrar(dto);
        return ResponseEntity.status(201).body(salvo);
    }

}
