package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;


public class Especialidade {

	private String nome;
	private String descricao;
	
	
	
	//construtor da classe
	//public Especialidade( String nome) {
		//this.nome =nome;
			
	//}
	
	//public Especialidade() {
		
		
		
		
	//}
		
	//public Especialidade() {
		
		
		
	//}
	
	
	
	//Metodos de acesso aos atributos 
	//get/set do Nome 
	
	public void setNome(String nome) {
		
		if (nome.length() >= 3) {
			this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome valido! /n Deve conter pelo menos 3 letras! " );
		}
		
	} 
	
	public String getNome() {
		
		return nome;
		
	}
	
	//get/set da descrição 
	public void setDescricao(String descricao) {
		 if (descricao.length() >= 10) {
			this.descricao = descricao;
		}else {
			 JOptionPane.showConfirmDialog(null, descricao + "a Descrição deve haver no minimo 10 caracteris ");
		}
		
	}
	
	public String getDescricao(){
		return descricao; 
		
		
	}
}
