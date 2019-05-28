package fr.ecobattle.garage;

import java.util.ArrayList;

public abstract class Voiture extends Terrestre{


    public Voiture(String nom, Coffre coffre, ArrayList<Moteur> moteurs) {
        super(nom, coffre, moteurs, new ArrayList<Roue>(4));

        for (int i = 0; i < 4; i++) {
            this.getRoues().add(new Roue());
        }
    }
}
