package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 0;
    private String nome;
    private Integer codigo;
    private String descricao;

    //contrutor da class
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();

    }
    //
    public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }

    //construtor defult
    public Especialidade() {
        gerarCodigo();

    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;

    }

    public static int getContador() {
        return contador;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    //métodos de acesso aos atributos 
    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;

            JOptionPane.showMessageDialog(null, "Especialiade" + ">" + nome + "<" + "setada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, nome + "não é um nome válido!\nDeve conter no minimo 3 letras");
        }
    }

    public String getNome() {
        return nome;

    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showInternalMessageDialog(null, descricao + "não é válida para uma descrição!\n digite novamente!");
        }

    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }

}
