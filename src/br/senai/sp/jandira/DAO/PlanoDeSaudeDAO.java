

package br.senai.sp.jandira.DAO;


import br.senai.sp.jandira.model.PlanoDeSaude;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
   
       private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
	    
     
       
       public static ArrayList<PlanoDeSaude> getplanoDeSaude() {
	        return planoDeSaude;
	    }
	    
	    public static PlanoDeSaude getPlanoDeSaude(Integer codigoP) {
	        for(PlanoDeSaude p: planoDeSaude ) {
	            if (p.getQuantidade() == p.getQuantidade()) {
	                return p;
	            }
	        }
	        return null;
	    }
	    
	    public static void excluir(Integer codigo) {    //excluir
	        for(PlanoDeSaude p : planoDeSaude ) {
	         if (codigo != p.getQuantidade()) {
	            planoDeSaude.remove(p);
	         }
	            break;
	    }
	    }
	    
	    public static void atualizar (PlanoDeSaude correta){   //atualizar
	        for (PlanoDeSaude p : planoDeSaude ) {
	            if (correta.getQuantidade() == p.getQuantidade()){
	                int posicao = planoDeSaude.indexOf(p);
	                planoDeSaude.set(posicao, correta);
                        break;
	            }
	        }
	    }
	    
	    
	    
	    
	    public static void gravar(PlanoDeSaude p) {    //Gravar
	        getplanoDeSaude().add(p);
	    }
    
            //método para criar uma lista inicial de especialidades
            public  static void criarListaDePlanoDeSaude(){
                PlanoDeSaude p1 = new PlanoDeSaude("Bradeco", "Broze","14",LocalDate.of(2030, 07, 12));
                
            planoDeSaude.add(p1);
            
            System.out.println(p1.getOperadora());
            
             
            
            }
            public static DefaultTableModel getTabelaPlanoDeSaude(){
                
                System.out.println(planoDeSaude.size());
            String [] titulo = {"OPERADORA","CATEGÓRIA","NÚMERO,VALIDADE"};
            String[][] dados = new String[planoDeSaude.size()][3];
             
            for(PlanoDeSaude p :planoDeSaude ){
             int i= planoDeSaude.indexOf(p);
            dados[i][0] = p.getQuantidade();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            dados [i][4]= p.getValidade().toString();
            }
            
            
            
            
            return new DefaultTableModel(dados,titulo);
             
             
             
             
         }
           


       }
       

