package com.estudando.spring.repository;

import com.estudando.spring.entity.Laboratorio;
import com.estudando.spring.entity.RemedioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RemedioRepository extends JpaRepository<RemedioModel, Long> {

    List<RemedioModel> findByNome(String nome);

    List<RemedioModel> findByValidade(LocalDate data);

    List<RemedioModel> findByLaboratorio(Laboratorio laboratorio);

    List<RemedioModel> findByQuantidade(Integer quantidade);

}
