package org.example.Model;

public class Entraineur {
    String Nom;
    String Specialite;

    public Entraineur(String nom, String specialite) {
        Nom = nom;
        Specialite = specialite;
    }
    public Entraineur(){}

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }
}
