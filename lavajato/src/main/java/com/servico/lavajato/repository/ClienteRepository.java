package com.servico.lavajato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servico.lavajato.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
 
	Cliente findById(long id);
}
