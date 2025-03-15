package models;

import enums.Ausrüstung;
import enums.Fähigkeit;
import enums.Unterstützungsaktivität;
import interfaces.ILocation;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Hilfsgesuch {
    private UUID id;
    private Organisation organisation;
    private Einsatzleiter einsatzleiter;
    private ILocation einsatzgebiet;
    private List<Unterstützungsaktivität> aktivitäten;
    private List<Schicht> schichten;
    private List<Fähigkeit> benötigteFähigkeiten;
    private List<Ausrüstung> benötigteAusrüstung;
    private int benötigteHelfer;
    private List<Hilfsangebot> zugewieseneHelfer;
    private List<Hilfsangebot> anwesendeHelfer ;
}