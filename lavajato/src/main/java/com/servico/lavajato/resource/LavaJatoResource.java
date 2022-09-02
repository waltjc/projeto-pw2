package com.servico.lavajato.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servico.lavajato.models.LavaJato;
import com.servico.lavajato.repository.LavaJatoRepository;


@RestController
@RequestMapping(value="/api")
public class LavaJatoResource {

	@Autowired
	LavaJatoRepository lavaJatoRepository;
	
	@GetMapping("/lavajato")
	public List<LavaJato> listaLavaJato(){
		return lavaJatoRepository.findAll();
	}
	@GetMapping("/lavajato/{id}")
	public LavaJato listaLavaJatoUnico(@PathVariable(value="id") long id){
		return lavaJatoRepository.findById(id);
	}
	@PostMapping("/lavajato")
	public LavaJato salvarLavaJato(@RequestBody LavaJato produto) {
		return lavaJatoRepository.save(produto);
	}
	
	@DeleteMapping("/lavajato/{id}")
	public void deletarLavaJato(@PathVariable(value="id") long id) {
		lavaJatoRepository.deleteById(id);
	}
	
	@PutMapping("/lavajato")
	public LavaJato editarLavaJato(@RequestBody LavaJato produto) {
		return lavaJatoRepository.save(produto);
	}
}
