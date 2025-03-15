package models;

import interfaces.Person;

public class Einsatzleiter extends Person {
    private Organisation organisation;

    public Einsatzleiter(String name, String adresse, String telefon, Organisation organisation) {
        super(name, adresse, telefon);
        this.organisation = organisation;
    }

}