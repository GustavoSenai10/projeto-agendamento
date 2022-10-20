

package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;


public class PlanoDeSaudeDAO {
   
       private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
	    public static ArrayList<PlanoDeSaude> getplanoDeSaude() {
	        return planoDeSaude;
	    }
       
       
       }
       

