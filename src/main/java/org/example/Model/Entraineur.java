package org.example.Model;

public class Entraineur {
    String Nom;
    String specialite;

    public Entraineur(String nom, String specialite) {
        Nom = nom;
        specialite = specialite;
    }
    public Entraineur(){}

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        specialite = specialite;
    }
}
