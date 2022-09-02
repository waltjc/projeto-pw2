package com.servico.lavajato.models;


import java.io.Serializable;
import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="TB_Servico")
public class Servico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idServico;
	
	private String nome;
	private BigDecimal preco;
	
	
	public long getId() {
		return idServico;
	}
	public void setId(long id) {
		this.idServico = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	
}