package fr.ecobattle.garage;

public class Coffre {

    private int contenance;

    public Coffre(int contenance) {
        this.contenance = contenance;
    }

    public int getContenance() {
        return contenance;
    }

    @Override
    public String toString() {
        return String.format("La contenaces est de %s Litres", contenance);
    }
}
