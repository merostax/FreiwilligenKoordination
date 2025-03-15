package models;

import enums.Ausrüstung;
import enums.Fähigkeit;
import interfaces.Person;
import lombok.*;
import java.util.List;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Freiwilliger extends Person {
    private List<Fähigkeit> fähigkeiten;
    private List<Ausrüstung> ausrüstung;
    private List<Hilfsangebot> hilfsangebote;

    public Freiwilliger(String name, String adresse, String telefon) {
        super(name, adresse, telefon);
    }

}
