package com.catsanddogs.agendamentos.models;

import java.sql.Time;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@JsonFormat(pattern="HH:mm")
	private LocalTime segundaHoraInicio, segundaHoraFinal;
	private LocalTime tercaHoraInicio, tercaHoraFinal;
	private LocalTime quartaHoraInicio, quartaHoraFinal;
	private LocalTime quintaHoraInicio, quintaHoraFinal;
	private LocalTime sextaHoraInicio, sextaHoraFinal;
	private LocalTime sabadoHoraInicio, sabadoHoraFinal;
	private LocalTime domingoHoraInicio, domingoHoraFinal;


	public LocalTime getSegundaHoraInicio() {
		return segundaHoraInicio;
	}

	public void setSegundaHoraInicio(LocalTime segundaHoraInicio) {
		this.segundaHoraInicio = segundaHoraInicio;
	}

	public LocalTime getSegundaHoraFinal() {
		return segundaHoraFinal;
	}

	public void setSegundaHoraFinal(LocalTime segundaHoraFinal) {
		this.segundaHoraFinal = segundaHoraFinal;
	}

	public LocalTime getTercaHoraInicio() {
		return tercaHoraInicio;
	}

	public void setTercaHoraInicio(LocalTime tercaHoraInicio) {
		this.tercaHoraInicio = tercaHoraInicio;
	}

	public LocalTime getTercaHoraFinal() {
		return tercaHoraFinal;
	}

	public void setTercaHoraFinal(LocalTime tercaHoraFinal) {
		this.tercaHoraFinal = tercaHoraFinal;
	}

	public LocalTime getQuartaHoraInicio() {
		return quartaHoraInicio;
	}

	public void setQuartaHoraInicio(LocalTime quartaHoraInicio) {
		this.quartaHoraInicio = quartaHoraInicio;
	}

	public LocalTime getQuartaHoraFinal() {
		return quartaHoraFinal;
	}

	public void setQuartaHoraFinal(LocalTime quartaHoraFinal) {
		this.quartaHoraFinal = quartaHoraFinal;
	}

	public LocalTime getQuintaHoraInicio() {
		return quintaHoraInicio;
	}

	public void setQuintaHoraInicio(LocalTime quintaHoraInicio) {
		this.quintaHoraInicio = quintaHoraInicio;
	}

	public LocalTime getQuintaHoraFinal() {
		return quintaHoraFinal;
	}

	public void setQuintaHoraFinal(LocalTime quintaHoraFinal) {
		this.quintaHoraFinal = quintaHoraFinal;
	}

	public LocalTime getSextaHoraInicio() {
		return sextaHoraInicio;
	}

	public void setSextaHoraInicio(LocalTime sextaHoraInicio) {
		this.sextaHoraInicio = sextaHoraInicio;
	}

	public LocalTime getSextaHoraFinal() {
		return sextaHoraFinal;
	}

	public void setSextaHoraFinal(LocalTime sextaHoraFinal) {
		this.sextaHoraFinal = sextaHoraFinal;
	}

	public LocalTime getSabadoHoraInicio() {
		return sabadoHoraInicio;
	}

	public void setSabadoHoraInicio(LocalTime sabadoHoraInicio) {
		this.sabadoHoraInicio = sabadoHoraInicio;
	}

	public LocalTime getSabadoHoraFinal() {
		return sabadoHoraFinal;
	}

	public void setSabadoHoraFinal(LocalTime sabadoHoraFinal) {
		this.sabadoHoraFinal = sabadoHoraFinal;
	}

	public LocalTime getDomingoHoraInicio() {
		return domingoHoraInicio;
	}

	public void setDomingoHoraInicio(LocalTime domingoHoraInicio) {
		this.domingoHoraInicio = domingoHoraInicio;
	}

	public LocalTime getDomingoHoraFinal() {
		return domingoHoraFinal;
	}

	public void setDomingoHoraFinal(LocalTime domingoHoraFinal) {
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
	
}
