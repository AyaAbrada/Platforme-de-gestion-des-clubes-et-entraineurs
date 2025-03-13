package org.example.Model;

public class Entraineur {
    String nom;
    String specialite;
    String email;
    String password;
    String role;

    public Entraineur(String nom, String specialite, String email, String password) {
        this.nom = nom;
        this.specialite = specialite;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public Entraineur(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        specialite = specialite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
