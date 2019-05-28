package fr.ecobattle.garage;

import java.util.ArrayList;

public abstract class Flotant extends Vehicule {

    public Flotant(String nom, Coffre coffre, ArrayList<Moteur> moteurs) {
        super(nom, coffre, moteurs);
    }

    public abstract void flotter();
}
