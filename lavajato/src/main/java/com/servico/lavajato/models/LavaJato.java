package com.servico.lavajato.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="TB_LavaJato")
public class LavaJato implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idLavaJato;
	
	@OneToOne
	
	private Cliente cliente;
	
	@OneToOne
	private Servico servico;
	
	public long getId() {
		return idLavaJato;
	}
	public void setId(long id) {
		this.idLavaJato = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		
		this.cliente = cliente;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		
		this.servico = servico;
	}

	
}
