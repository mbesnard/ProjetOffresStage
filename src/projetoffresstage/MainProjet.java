/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoffresstage;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author m-besnard
 */
public class MainProjet {
    	public static ArrayList<OffreStage> lesOffres = new ArrayList<OffreStage>();
        public static ArrayList<Entreprise> lesEntreprises = new ArrayList<Entreprise>();
        
        public void setEntreprise(Entreprise e1){
            lesEntreprises.add(e1);
        }
        
        public void setOffre(OffreStage o1){
            lesOffres.add(o1);
        }
        
        public static void main (String [] args){ 
           JFrame variable = new JFrame();
           variable.setVisible(true);
        }
}
   

