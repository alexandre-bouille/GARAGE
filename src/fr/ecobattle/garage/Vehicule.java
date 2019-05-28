package fr.ecobattle.garage;

import java.util.ArrayList;

public abstract class Vehicule {
    private String nom;
    private Coffre coffre;
    private ArrayList<Moteur> moteurs;


    public Vehicule(String nom, Coffre coffre, ArrayList<Moteur> moteurs) {
        this.nom = nom;
        this.coffre = coffre;
        this.moteurs = moteurs;
    }

    public String getNom() {
        return nom;
    }

    public Coffre getCoffre() {
        return coffre;
    }

    public ArrayList<Moteur> getMoteurs() {
        return moteurs;
    }
}
