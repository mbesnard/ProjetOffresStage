/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoffresstage;

import java.io.Serializable;

/**
 *
 * @author m-besnard
 */
public class OffreStage implements Serializable{
    private String libelléOffre;
    private String descriptifOffre;
    private String domaineOffre;
    private String dateDébutOffre;
    private String duréeOffre; 
    private String cheminOffre;
    private String valide;

    public OffreStage(String libelléOffre, String descriptifOffre, String domaineOffre, String dateDébutOffre, String duréeOffre, String cheminOffre, String valide) {
        this.libelléOffre = libelléOffre;
        this.descriptifOffre = descriptifOffre;
        this.domaineOffre = domaineOffre;
        this.dateDébutOffre = dateDébutOffre;
        this.duréeOffre = duréeOffre;
        this.cheminOffre = cheminOffre;
        this.valide = valide;
    }

    public String getLibelléOffre() {
        return libelléOffre;
    }

    public void setLibelléOffre(String libelléOffre) {
        this.libelléOffre = libelléOffre;
    }

    public String getDescriptifOffre() {
        return descriptifOffre;
    }

    public void setDescriptifOffre(String descriptifOffre) {
        this.descriptifOffre = descriptifOffre;
    }

    public String getDomaineOffre() {
        return domaineOffre;
    }

    public void setDomaineOffre(String domaineOffre) {
        this.domaineOffre = domaineOffre;
    }

    public String getDateDébutOffre() {
        return dateDébutOffre;
    }

    public void setDateDébutOffre(String dateDébutOffre) {
        this.dateDébutOffre = dateDébutOffre;
    }

    public String getDuréeOffre() {
        return duréeOffre;
    }

    public void setDuréeOffre(String duréeOffre) {
        this.duréeOffre = duréeOffre;
    }

    public String getCheminOffre() {
        return cheminOffre;
    }

    public void setCheminOffre(String cheminOffre) {
        this.cheminOffre = cheminOffre;
    }

    public String getValide() {
        return valide;
    }

    public void setValide(String valide) {
        this.valide = valide;
    }

    @Override
    public String toString() {
        return "OffreStage{" + "libell\u00e9Offre=" + libelléOffre + ", descriptifOffre=" + descriptifOffre + ", domaineOffre=" + domaineOffre + ", dateD\u00e9butOffre=" + dateDébutOffre + ", dur\u00e9eOffre=" + duréeOffre + ", cheminOffre=" + cheminOffre + ", valide=" + valide + '}';
    }

    
    
}
