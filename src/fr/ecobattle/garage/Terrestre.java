package fr.ecobattle.garage;

import java.util.ArrayList;

public abstract class Terrestre extends Vehicule{

    private ArrayList<Roue> roues;

    public Terrestre(String nom, Coffre coffre, ArrayList<Moteur> moteurs, ArrayList<Roue> roues) {
        super(nom, coffre, moteurs);
        this.roues = roues;
    }

    public ArrayList<Roue> getRoues() {
        return roues;
    }

    public abstract void rouler();





}
