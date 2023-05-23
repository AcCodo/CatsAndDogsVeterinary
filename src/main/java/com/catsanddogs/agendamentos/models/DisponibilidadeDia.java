package com.catsanddogs.agendamentos.models;

import java.time.DayOfWeek;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DisponibilidadeDia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.ORDINAL)
	private DayOfWeek diaSemana;
	
	private int horaInicio, horaFinal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DayOfWeek getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DayOfWeek diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}
	
}
