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

import com.servico.lavajato.models.Servico;

import com.servico.lavajato.repository.ServicosRepository;

@RestController
@RequestMapping(value="/api")
public class ServicosResource {

	@Autowired
	ServicosRepository servicoRepository;
	
	@GetMapping("/servicos")
	public List<Servico> listaServicos(){
		return servicoRepository.findAll();
	}
	@GetMapping("/servicos/{id}")
	public Servico listaServicoUnico(@PathVariable(value="id") long id){
		return servicoRepository.findById(id);
	}
	@PostMapping("/servicos")
	public Servico salvarServico(@RequestBody Servico produto) {
		return servicoRepository.save(produto);
	}
	
	@DeleteMapping("/servicos/{id}")
	public void deletarServico(@PathVariable(value="id") long id) {
		servicoRepository.deleteById(id);
	}
	
	@PutMapping("/servicos")
	public Servico editarServico(@RequestBody Servico produto) {
		return servicoRepository.save(produto);
	}
}
