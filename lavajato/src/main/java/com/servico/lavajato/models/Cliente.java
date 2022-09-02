package com.servico.lavajato.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="TB_Cliente")
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCliente;
	

	private String nome;
	private long telefone;
	private String pass;
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getId() {
		return idCliente;
	}
	public void setId(long id) {
		this.idCliente = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	
}
