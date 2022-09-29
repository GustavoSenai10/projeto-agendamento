package br.senai.sp.jandira.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;


public class PlanoDeSaude {

	private String operadora; 
	private	 String categoria;
	private	String numero;
	private LocalDate validade;
	private int quantidade;
	
	
	//Operadora
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public PlanoDeSaude(String operadora) {
			this.operadora = operadora;
			
		
		
	}
	
	public PlanoDeSaude() {
		this.quantidade++;
		
			
	}
	
	//Categoria
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//numero
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//Validade
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	
	//quantidade 
	public static int getQuantidade() {
		return getQuantidade();
	}
	
}
