package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agendamento {

	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta ;	
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;
	
	
	//Data da consulta
	public LocalDate getData() {
		return dataDaConsulta;
	}
	public void setData(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	
	//Hora Da Consulta
	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}
	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}
	
	//Paciente
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	//Medico
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	//Especialidade
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
}
