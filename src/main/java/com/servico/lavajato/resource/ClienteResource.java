package com.servico.lavajato.resource;
//Api rest
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController // @Controller Indica que este controller por padrão responderá usando, por padrão, o formato JSON.
// 				   @ResponseBody Indicamos que o objeto usuario tem que ser buscado no corpo da requisição.
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired // Com essa anotação indicamos que os parâmetros do nosso construtor serão injetados
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
	public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente produto) {
		Cliente usuario = clienteRepository.save(produto);
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deletarCliente(@PathVariable(value="id") long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/cliente")
	public ResponseEntity<Cliente> editarCliente(@RequestBody Cliente produto) {
		Cliente editCliente = clienteRepository.save(produto);
		return new ResponseEntity<>(editCliente, HttpStatus.CREATED);
	}
}

