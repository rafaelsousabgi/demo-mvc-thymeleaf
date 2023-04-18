package com.example.demo.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.curso.boot.domain.Funcionario;


public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataSaida(LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);
	
}
