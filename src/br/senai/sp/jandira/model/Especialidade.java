package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;


public class Especialidade {
        private  static int contador;
	private String nome;
        private Integer codigo;
	private String descricao;
	
	
        //contrutor da class
        public Especialidade(String nome){
            this.contador++;
            this.nome=nome;
        
        
        
        
        }
        public  Especialidade (String nome, String descricao){
            this.nome= nome;
            this.descricao = descricao;
            this.contador++;
            this.codigo =contador;
        
        
        }
        //construtor defult
        public Especialidade(){
            this.contador++;
            this.codigo =contador;
        
        }
        public static int getContador(){
            return contador;
        
        
        }
        //métodos de acesso aos atributos 
        public void setNome(String nome ){
            if (nome.length()>=3){
                this.nome=nome;
        
                    
        }
        
        
        
        }
	
	//Nome da Especialidade
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Descrição da Especialidade
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

	
}
