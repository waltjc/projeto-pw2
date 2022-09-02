package com.servico.lavajato.dtos;

import com.servico.lavajato.models.Cliente;

public class ClienteDTO {
	private Long id;
	private String name;
	private long telefone;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Long id, String name, long telefone) {
		super();
		this.id = id;
		this.name = name;
		this.telefone = telefone;
	}
	public ClienteDTO(Cliente cliente) {
		super();
		id = cliente.getId();
		name = cliente.getNome();
		telefone = cliente.getTelefone();
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
