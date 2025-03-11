package org.example.Model;
import java.util.Date;

public class Seance {
    int idMembre;
    int idEntraineur;
    Date dateHeur;

    public Seance(int idMembre, int idEntraineur, Date dateHeur) {
        this.idMembre = idMembre;
        this.idEntraineur = idEntraineur;
        this.dateHeur = dateHeur;
    }
    public Seance(){}

    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    public int getIdEntraineur() {
        return idEntraineur;
    }

    public void setIdEntraineur(int idEntraineur) {
        this.idEntraineur = idEntraineur;
    }

    public Date getDateHeur() {
        return dateHeur;
    }

    public void setDateHeur(Date dateHeur) {
        this.dateHeur = dateHeur;
    }
}
