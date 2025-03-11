package org.example.Model;
import java.util.Date;

public class Membre {
    String nom;
    Date DateNessance;
    String SportPratique;

    public Membre(String nom, Date dateNessance, String sportPratique) {
        this.nom = nom;
        DateNessance = dateNessance;
        SportPratique = sportPratique;
    }
    public Membre(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNessance() {
        return DateNessance;
    }

    public void setDateNessance(Date dateNessance) {
        DateNessance = dateNessance;
    }

    public String getSportPratique() {
        return SportPratique;
    }

    public void setSportPratique(String sportPratique) {
        SportPratique = sportPratique;
    }
}
