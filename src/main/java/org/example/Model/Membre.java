package org.example.Model;
import java.util.Date;

public class Membre {
    String nom;
    Date dateNessance;
    String sportPratique;

    public Membre(String nom, Date dateNessance, String sportPratique) {
        this.nom = nom;
        dateNessance = dateNessance;
        sportPratique = sportPratique;
    }
    public Membre(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNessance() {
        return dateNessance;
    }

    public void setDateNessance(Date dateNessance) {
        dateNessance = dateNessance;
    }

    public String getSportPratique() {
        return sportPratique;
    }

    public void setSportPratique(String sportPratique) {
        sportPratique = sportPratique;
    }
}
