package com.estudando.spring.repository;

import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.RemedioModel;
import com.estudando.spring.entity.Via;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RemedioRepository extends JpaRepository<RemedioModel, Long> {

    List<RemedioModel> findByNomeContainingIgnoreCase(String nome);

    List<RemedioModel> findByLaboratorio(Laboratorio laboratorio);

    List<RemedioModel> findByVia(Via via);

    List<RemedioModel> findByValidadeBefore(LocalDate data);

    boolean existsByNomeAndViaAndLaboratorio(String nome, Via via, Laboratorio laboratorio);
}