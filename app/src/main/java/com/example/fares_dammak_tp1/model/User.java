package com.example.fares_dammak_tp1.model;

public class User {
    private String nom ;
    private String mdp;

    public User(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
