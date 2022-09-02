package com.servico.lavajato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servico.lavajato.models.LavaJato;


public interface LavaJatoRepository extends JpaRepository<LavaJato,Long> {
 
	LavaJato findById(long id);
}
