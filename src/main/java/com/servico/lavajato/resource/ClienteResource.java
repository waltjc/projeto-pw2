package com.servico.lavajato.resource;
//Api rest
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
=======
>>>>>>> 795af1aeb70df2619f121fbe47b7c314ef50de11
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

<<<<<<< HEAD
@RestController // @Controller Indica que este controller por padrão responderá usando, por padrão, o formato JSON.
// 				   @ResponseBody Indicamos que o objeto usuario tem que ser buscado no corpo da requisição.
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired // Com essa anotação indicamos que os parâmetros do nosso construtor serão injetados
=======
@RestController // @Controller e @ResponseBody transformando todo retorno do serviço para um JSON,
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired //Injeta a dependencia no crude de cliente.
>>>>>>> 795af1aeb70df2619f121fbe47b7c314ef50de11
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
<<<<<<< HEAD
	public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente produto) {
		Cliente usuario = clienteRepository.save(produto);
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
=======
	public Cliente salvarCliente(@RequestBody Cliente produto) {
		return clienteRepository.save(produto);
>>>>>>> 795af1aeb70df2619f121fbe47b7c314ef50de11
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deletarCliente(@PathVariable(value="id") long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/cliente")
<<<<<<< HEAD
	public ResponseEntity<Cliente> editarCliente(@RequestBody Cliente produto) {
		Cliente editCliente = clienteRepository.save(produto);
		return new ResponseEntity<>(editCliente, HttpStatus.CREATED);
=======
	public Cliente editarCliente(@RequestBody Cliente produto) {
		return clienteRepository.save(produto);
>>>>>>> 795af1aeb70df2619f121fbe47b7c314ef50de11
	}
}

