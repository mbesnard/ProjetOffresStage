/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoffresstage;

/**
 *
 * @author m-besnard
 */
public class Entreprise {
    private String raisonSociale;
    private String adresseVilleEntreprise;
    private String adresseRueEntreprise;
    private String adresseCodePostalEntreprise;
    private String telEntreprise; 
    private String secteurActivité;

    public Entreprise(String raisonSociale, String adresseVilleEntreprise, String adresseRueEntreprise, String adresseCodePostalEntreprise, String telEntreprise, String secteurActivité) {
        this.raisonSociale = raisonSociale;
        this.adresseVilleEntreprise = adresseVilleEntreprise;
        this.adresseRueEntreprise = adresseRueEntreprise;
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
        this.telEntreprise = telEntreprise;
        this.secteurActivité = secteurActivité;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresseVilleEntreprise() {
        return adresseVilleEntreprise;
    }

    public void setAdresseVilleEntreprise(String adresseVilleEntreprise) {
        this.adresseVilleEntreprise = adresseVilleEntreprise;
    }

    public String getAdresseRueEntreprise() {
        return adresseRueEntreprise;
    }

    public void setAdresseRueEntreprise(String adresseRueEntreprise) {
        this.adresseRueEntreprise = adresseRueEntreprise;
    }

    public String getAdresseCodePostalEntreprise() {
        return adresseCodePostalEntreprise;
    }

    public void setAdresseCodePostalEntreprise(String adresseCodePostalEntreprise) {
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
    }

    public String getTelEntreprise() {
        return telEntreprise;
    }

    public void setTelEntreprise(String telEntreprise) {
        this.telEntreprise = telEntreprise;
    }

    public String getSecteurActivité() {
        return secteurActivité;
    }

    public void setSecteurActivité(String secteurActivité) {
        this.secteurActivité = secteurActivité;
    }

    @Override
    public String toString() {
        return "Entreprise{" + "raisonSociale=" + raisonSociale + ", adresseVilleEntreprise=" + adresseVilleEntreprise + ", adresseRueEntreprise=" + adresseRueEntreprise + ", adresseCodePostalEntreprise=" + adresseCodePostalEntreprise + ", telEntreprise=" + telEntreprise + ", secteurActivit\u00e9=" + secteurActivité + '}';
    }

  
    
}
