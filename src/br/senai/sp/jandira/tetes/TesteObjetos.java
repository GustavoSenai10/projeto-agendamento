package br.senai.sp.jandira.tetes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologista");
		e1.setDescricao("Não deixa ter um ataque");
	
		Especialidade e2 = new Especialidade("Gastroenterologia");
		e2.setDescricao("Não deixa ficar com dor de barriga");
		
		Especialidade e4= new Especialidade();
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Qualquer coisa!!");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
		
		//imprimeir o no console o nome das especialidades 
		//que estão na arraylist
		
		int i = 0;
		while (i< especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		}
		
		// Utilização do for para iteração no arraylist
		// for (contador;condição;acumulador){
		
			//}
		
		System.out.println("------------For-------------");
			for (int j = 0; j < especialidades.size(); j++) {
				
				System.out.println(especialidades.get(j).getNome());
			}
			
		System.out.println("----------For Eanch----------");
		
		//For Eanch -> para cada 
		for (Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
	
		// Criar 3 planos de saúde, armazenar em um arraylist
		//Exibir o nome da operadora de cada um deles
		
		PlanoDeSaude p1 = new PlanoDeSaude("Amil");
		PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
		PlanoDeSaude p3 = new PlanoDeSaude("Notredame");
		
		System.out.println("-----------FOR EANCH Planos----------");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(p1);
		planos.add(p2);
		planos.add(p3);
		
		for (PlanoDeSaude p : planos) {
			System.out.println(p.getOperadora());
			System.out.println(p.getQuantidade());
		}
		PlanoDeSaude xpto = new PlanoDeSaude();
		PlanoDeSaude xpto1 = new PlanoDeSaude();
		PlanoDeSaude xpto2 = new PlanoDeSaude();
		
		AgendaApp.main(args);
		
		System.out.println("---" + PlanoDeSaude.getQuantidade());
		System.out.println("total= " + Especialidade.getContador());
		System.out.println(e1.getCodigo()+ "-" + e1.getNome());
		System.out.println(e2.getCodigo()+ "-" + e2.getNome());
		System.out.println(e3.getCodigo()+ "-" + e3.getNome());
		System.out.println(e4.getCodigo()+ "-" + e4.getNome());
	}
	

}
