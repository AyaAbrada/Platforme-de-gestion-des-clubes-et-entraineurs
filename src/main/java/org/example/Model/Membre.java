package org.example.Model;
import java.util.Date;

public class Membre {
    String nom;
    Date dateNessance;
    String sportPratique;
    String email;
    String password;
    String role;

    public Membre(String nom, Date dateNessance, String sportPratique, String email, String password, String role) {
        this.nom = nom;
        this.dateNessance = dateNessance;
        this.sportPratique = sportPratique;
        this.email = email;
        this.password =password;
        this.role = role;
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

    public String getRol() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
