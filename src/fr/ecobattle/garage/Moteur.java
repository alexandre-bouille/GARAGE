package fr.ecobattle.garage;

public class Moteur {
    private int chevaux;

    public Moteur(int chevaux) {
        this.chevaux = chevaux;
    }

    public int getChevaux() {
        return chevaux;

    }

    @Override
    public String toString() {
        return String.format("La puissances est de %s Chevux", chevaux);
    }
}

