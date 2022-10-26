package br.senai.sp.jandira.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;


public class PlanoDeSaude {

	private String operadora; 
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
	private static int contador =99;
	private  int codigo;
	
	
		
	
	             //Métodos Construtores 
		
	private void gerarCodigo() {
                this.codigo = contador;
                this.contador++;
        }
	
	//Default
	public PlanoDeSaude() {
                    gerarCodigo();
		
	}	
	
             public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
		gerarCodigo();
	}
	
	public PlanoDeSaude(String operadora, String categoria,String numero, LocalDate validade) {
		this.operadora = operadora;
		this.categoria=categoria;
		this.numero = numero;
		this.validade= validade;
		gerarCodigo();

	}
	
                 //MÉTODOS 
                 
               //Código
                public Integer getCodigo() {
                return codigo;
                }

      
        
	//Operadora
	public void setOperadora(String operadora) {
		this.operadora = operadora;
		gerarCodigo();
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
