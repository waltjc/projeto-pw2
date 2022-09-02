package com.servico.lavajato.resource;

import java.util.ArrayList;
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

import com.servico.lavajato.dtos.ClienteDTO;
import com.servico.lavajato.models.Cliente;
import com.servico.lavajato.repository.ClienteRepository;

@RestController
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	
	@GetMapping("/cliente")	
	public List<ClienteDTO> listaClientes(){
		
		List<Cliente> listaCliente = clienteRepository.findAll();
		List<ClienteDTO> listaClienteDTO = new ArrayList<ClienteDTO>();
		for (Cliente c : listaCliente) {
			ClienteDTO dto = new ClienteDTO(c);
			listaClienteDTO.add(dto);
		}
		return listaClienteDTO;
		
	}
	
	@GetMapping("/cliente/{id}")
		public ClienteDTO listaClienteUnico(@PathVariable(value="id") long id){
		Cliente entidade = clienteRepository.findById(id);
		ClienteDTO dto = new ClienteDTO(entidade);
		return dto;
	}
	@PostMapping("/cliente")
	public Cliente salvarCliente(@RequestBody Cliente produto) {
		return clienteRepository.save(produto);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deletarCliente(@PathVariable(value="id") long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/cliente")
	public Cliente editarCliente(@RequestBody Cliente produto) {
		return clienteRepository.save(produto);
	}
}
