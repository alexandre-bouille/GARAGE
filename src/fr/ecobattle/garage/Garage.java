package fr.ecobattle.garage;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicule> vehicules = new ArrayList<>();

    public void addVehicule(Vehicule vehicule){
        this.vehicules.add(vehicule);
    }


}
