package com.servico.lavajato.resource;
//Api rest
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

import com.servico.lavajato.models.Cliente;
import com.servico.lavajato.repository.ClienteRepository;

@RestController // @Controller e @ResponseBody transformando todo retorno do serviço para um JSON,
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired //Injeta a dependencia no crude de cliente.
	ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	@GetMapping("/cliente/{id}")
	public Cliente listaClienteUnico(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
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

