package br.senai.sp.jandira.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;


public class PlanoDeSaude {

	private String operadora; 
	private	 String categoria;
	private	String numero;
	private LocalDate valida;
	
	
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getValida() {
		return valida;
	}
	public void setValida(LocalDate valida) {
		this.valida = valida;
	}
	


}
