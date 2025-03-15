package models;

import interfaces.ILocation;

public class Einsatzort implements ILocation {
    private String adresse;
    private GeoKoordinaten koordinaten;

    public Einsatzort(String adresse, GeoKoordinaten koordinaten) {
        this.adresse = adresse;
        this.koordinaten = koordinaten;
    }

    @Override
    public String getBeschreibung() {
        return "Adresse: " + adresse;
    }
}
