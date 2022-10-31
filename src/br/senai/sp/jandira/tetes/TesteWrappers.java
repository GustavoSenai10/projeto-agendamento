package br.senai.sp.jandira.tetes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 5;

        Integer y = 5;

        Double x = 2.9;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        Especialidade e1 = new Especialidade("");
        e1.setNome("Cardiologista");
        e1.setDescricao("Não deixa ter um ataque");

        Especialidade e2 = new Especialidade("");
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");

        especialidades.add(e1);
        especialidades.add(e2);

        Especialidade e3 = new Especialidade("");
        e3.setNome("Fisioterapia");
        e3.setDescricao("não deixa ficar com dor nas costas.");

        especialidades.add(e3);

        Especialidade e4 = new Especialidade("");
        e3.setNome("Clinico Geral");
        e3.setDescricao("Cuida de Tudo");

        //Especialidade[] especialidade = {e1,e2,e3,e4};
        Especialidade e5 = new Especialidade();
        e5.setNome("pediatra");
        e5.setDescricao("Sabe cuidar de criancinhas.");

        especialidades.add(e4);
        especialidades.add(e5);
        //especialidade[4] = e5;

        //Arraylist add
        System.out.println(especialidades.size());

        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(50);
        notas.add(12);
        notas.add(25);
        notas.add(13);

        System.out.println(notas.size());

        //queremos ver o nome de especialidade que está na posição 
        //3 do Arraylist especialidade
        System.out.println(especialidades.get(3).getNome());

        //
        especialidades.get(1).setNome("Teste");
        System.out.println(especialidades.get(1).getNome());

        Especialidade z = new Especialidade("Dentista", "Cuidados dente");
    }

}
