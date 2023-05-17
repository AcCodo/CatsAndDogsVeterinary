package com.catsanddogs.agendamentos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private int crv;
	
	private Long especialidadeId;
	
	private Long[] disponibilidadeIds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCrv() {
		return crv;
	}

	public void setCrv(int crv) {
		this.crv = crv;
	}

	public Long getEspecialidadeId() {
		return especialidadeId;
	}

	public void setEspecialidadeId(Long especialidadeId) {
		this.especialidadeId = especialidadeId;
	}

	public Long[] getDisponibilidadeIds() {
		return disponibilidadeIds;
	}

	public void setDisponibilidadeIds(Long[] disponibilidadeIds) {
		this.disponibilidadeIds = disponibilidadeIds;
	}
	
}
