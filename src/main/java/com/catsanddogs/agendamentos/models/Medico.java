package com.catsanddogs.agendamentos.models;

import java.sql.Time;

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
	
	private Time segundaHoraInicio, segundaHoraFinal;
	private Time tercaHoraInicio, tercaHoraFinal;
	private Time quartaHoraInicio, quartaHoraFinal;
	private Time quintaHoraInicio, quintaHoraFinal;
	private Time sextaHoraInicio, sextaHoraFinal;
	private Time sabadoHoraInicio, sabadoHoraFinal;
	private Time domingoHoraInicio, domingoHoraFinal;

	public Time getSegundaHoraInicio() {
		return segundaHoraInicio;
	}

	public void setSegundaHoraInicio(Time segundaHoraInicio) {
		this.segundaHoraInicio = segundaHoraInicio;
	}

	public Time getSegundaHoraFinal() {
		return segundaHoraFinal;
	}

	public void setSegundaHoraFinal(Time segundaHoraFinal) {
		this.segundaHoraFinal = segundaHoraFinal;
	}

	public Time getTercaHoraInicio() {
		return tercaHoraInicio;
	}

	public void setTercaHoraInicio(Time tercaHoraInicio) {
		this.tercaHoraInicio = tercaHoraInicio;
	}

	public Time getTercaHoraFinal() {
		return tercaHoraFinal;
	}

	public void setTercaHoraFinal(Time tercaHoraFinal) {
		this.tercaHoraFinal = tercaHoraFinal;
	}

	public Time getQuartaHoraInicio() {
		return quartaHoraInicio;
	}

	public void setQuartaHoraInicio(Time quartaHoraInicio) {
		this.quartaHoraInicio = quartaHoraInicio;
	}

	public Time getQuartaHoraFinal() {
		return quartaHoraFinal;
	}

	public void setQuartaHoraFinal(Time quartaHoraFinal) {
		this.quartaHoraFinal = quartaHoraFinal;
	}

	public Time getQuintaHoraInicio() {
		return quintaHoraInicio;
	}

	public void setQuintaHoraInicio(Time quintaHoraInicio) {
		this.quintaHoraInicio = quintaHoraInicio;
	}

	public Time getQuintaHoraFinal() {
		return quintaHoraFinal;
	}

	public void setQuintaHoraFinal(Time quintaHoraFinal) {
		this.quintaHoraFinal = quintaHoraFinal;
	}

	public Time getSextaHoraInicio() {
		return sextaHoraInicio;
	}

	public void setSextaHoraInicio(Time sextaHoraInicio) {
		this.sextaHoraInicio = sextaHoraInicio;
	}

	public Time getSextaHoraFinal() {
		return sextaHoraFinal;
	}

	public void setSextaHoraFinal(Time sextaHoraFinal) {
		this.sextaHoraFinal = sextaHoraFinal;
	}

	public Time getSabadoHoraInicio() {
		return sabadoHoraInicio;
	}

	public void setSabadoHoraInicio(Time sabadoHoraInicio) {
		this.sabadoHoraInicio = sabadoHoraInicio;
	}

	public Time getSabadoHoraFinal() {
		return sabadoHoraFinal;
	}

	public void setSabadoHoraFinal(Time sabadoHoraFinal) {
		this.sabadoHoraFinal = sabadoHoraFinal;
	}

	public Time getDomingoHoraInicio() {
		return domingoHoraInicio;
	}

	public void setDomingoHoraInicio(Time domingoHoraInicio) {
		this.domingoHoraInicio = domingoHoraInicio;
	}

	public Time getDomingoHoraFinal() {
		return domingoHoraFinal;
	}

	public void setDomingoHoraFinal(Time domingoHoraFinal) {
		this.domingoHoraFinal = domingoHoraFinal;
	}

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
