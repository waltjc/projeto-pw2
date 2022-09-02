package com.servico.lavajato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servico.lavajato.models.Servico;


public interface ServicosRepository extends JpaRepository<Servico,Long> {
 
	Servico findById(long id);
}
