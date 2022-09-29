package br.senai.sp.jandira.model;


public class Medico {
	
	private String nome;
	private Especialidade [] especialidade;
	private String telefone;
	private String email;
	private String crm;
	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Especialidade
	
	public Especialidade[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}
	
	//Telefone
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//E-mail
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		 this.email = email;
	}
	
	//CRM
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
}
