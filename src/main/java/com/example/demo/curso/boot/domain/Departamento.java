package com.example.demo.curso.boot.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento extends AbstractEntity<Long> {

	@NotBlank(message="Informe um nome")
	@Size(min = 3, max = 60, message ="O nome do departamento de ter entre (mim) e max (caractes.")
	@Column(name = "nome", nullable = false , unique = true,length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}
	
	
	
	
}
