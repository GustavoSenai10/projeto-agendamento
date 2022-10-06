
package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;


    public class EspecialidadeDAO {
	    
	    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

	    public static ArrayList<Especialidade> getEspecialidades() {
	        return especialidades;
	    }
	    
	    public static Especialidade getEspecialidade(Integer codigo) {
	        for(Especialidade e : especialidades) {
	            if (codigo == e.getCodigo()) {
	                return e;
	            }
	        }
	        return null;
	    }
	    
	    public static void excluir(Integer codigo) {
	        for(Especialidade e : especialidades ) {
	         if (codigo != e.getCodigo()) {
	            especialidades.remove(e);
	         }
	            break;
	    }
	    }
	    
	    public static void atualizar (Especialidade correta){
	        for (Especialidade e : especialidades ) {
	            if (correta.getCodigo() == e.getCodigo()){
	                int posicao = especialidades.indexOf(e);
	                especialidades.set(posicao, correta);
	            }
	        }
	    }
	    
	    
	    
	    
	    public static void gravar(Especialidade e) {
	        especialidades.add(e);
	    }
    
            //método para criar uma lista inicial de especialidades
            public  static void criarListaDeEspecialidades(){
                Especialidade e1 = new Especialidade("Denstista", "cuida dos seus dentes");
                Especialidade e2 = new Especialidade("piscologo", "cuida da cabeça");
                Especialidade e3 = new Especialidade("Cardiologia", "cuida do coração");
                Especialidade e4 = new Especialidade("Clinico Geral", "cuida de tudo um pouco");
                
            especialidades.add(e1);
            especialidades.add(e2);
            especialidades.add(e3);
            especialidades.add(e4);
            
            }




}
