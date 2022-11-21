package br.senai.sp.jandira.model;

public class Medico {

    private String nome;
    private Especialidade[] especialidade;
    private String telefone;
    private String email;
    private String crm;
    private static int contador = 0;
    private int codigo;

    //Métodos Construtores
    private void gerarCodigo() {
        this.codigo = contador;
        this.codigo++;
    }

    //Default
    public Medico() {
        gerarCodigo();
    }

    public Medico(String crm) {
        this.crm = crm;
        gerarCodigo();
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

    public Medico(String nome,
            String crm,
            String telefone,
            Especialidade[] especialidades,
            Integer codigo) {

        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
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

    public String getmedicoSeparadosPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.telefone + ";" + this.especialidade + ";" + this.nome;
    }

}
