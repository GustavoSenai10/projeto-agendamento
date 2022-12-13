package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private String nome;
    private Especialidade[] especialidade;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private static int contador = 0;
    private int codigo;

    //Métodos Construtores
    private void gerarCodigo() {
        this.codigo = contador;
        this.contador++;
    }

    //Default
    public Medico() {
        gerarCodigo();
    }

    public Medico(String crm) {
        this.crm = crm;
    }

    public Medico(String nome,
            String crm,
            String telefone,
            Especialidade[] especialidades) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidades;
        gerarCodigo();

    }

    public Medico(Integer codigo,
            String crm,
            String telefone,
            String nome, LocalDate DataDeNascimeto) {

        this.crm = crm;
        this.nome = nome;
        this.dataDeNascimento = DataDeNascimeto;
        this.telefone = telefone;
        this.codigo = codigo;
        this.contador = codigo;

    }
//Código

    public Integer getCodigo() {
        return codigo;
    }

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

    //Data de Nascimento
    public LocalDate getdataDeNascimento() {
        return dataDeNascimento;
    }

    public void setdataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getmedicoSeparadosPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.dataDeNascimento + ";" + this.telefone + ";" + this.especialidade;
    }

}
