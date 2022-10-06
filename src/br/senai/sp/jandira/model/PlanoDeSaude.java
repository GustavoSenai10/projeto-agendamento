package br.senai.sp.jandira.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;


public class PlanoDeSaude {

	private String operadora; 
	private	 String categoria;
	private	String numero;
	private LocalDate validade;
	private static int quantidade;
	
	//métodos contrutores 
        public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		this.quantidade++;
	}
	
	public PlanoDeSaude() {
		this.quantidade++;
	}
	
        //métodos
        //Operadora
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return operadora;
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
		return quantidade;
	}
	
}
