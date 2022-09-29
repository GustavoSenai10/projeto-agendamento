package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private LocalDate dataDeNascimento;
	private String telefone;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private PlanoDeSaude planoDesaude;
	
	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Data de Nascimento
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	//Telefone
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//Endereço
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//RG
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//CPF
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Plano de Saude
	public PlanoDeSaude getPlanodesaude() {
		return planoDesaude;
	}
	public void setPlanodesaude(PlanoDeSaude planodesaude) {
		this.planoDesaude = planodesaude;
	}

}
