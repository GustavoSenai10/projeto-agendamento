package br.senai.sp.jandira.model;



public class Endereco {

	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String complemento;
	private Estados estados;
	private String cep;
	
	//Logradouro
	public String getLogadouro() {
		return logradouro;
	}
	public void setLogadouro(String logadouro) {
		this.logradouro = logradouro;
	}
	//Numero
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	//Bairro
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	//Cidade
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//Complemento
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//Estados
	public Estados getEstados() {
		return estados;
	}
	public void setEstados(Estados estados) {
		this.estados = estados;
	}
	
	//CEP
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
