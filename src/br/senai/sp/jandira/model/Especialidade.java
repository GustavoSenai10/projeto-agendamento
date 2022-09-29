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
        public Integer getCodigo() {
        	return codigo;
        	
        	
        	
        	
        	
        }
        
        //métodos de acesso aos atributos 
        public void setNome(String nome ){
            
        	if (nome.length()>=3){
                this.nome=nome;
        
                JOptionPane.showMessageDialog(null, "Especialiade" + ">"+ nome + "<" +"setada com sucesso!");
        	}else {
				JOptionPane.showMessageDialog(null, nome + "não é um nome válido!\nDeve conter no minimo 3 letras");
        	}
        }
        
        public String getNome() {
        	return nome;
        	
        	
        }
        
        public void setDescricao (String descricao ) {
        	if (descricao.length() >= 10) {
        		this.descricao = descricao;
			}else {
				JOptionPane.showInternalMessageDialog(null, descricao+"não é válida para uma descrição!\n digite novamente!");
			}
        	
        }
        
        public String getDescricao() {
        		return this.descricao;
        }
	
}
