package models;

import enums.Ausrüstung;
import enums.FreiwilligenStatus;
import enums.Fähigkeit;
import enums.Unterstützungsaktivität;
import interfaces.ILocation;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Hilfsangebot {
    private UUID id;
    private Freiwilliger freiwilliger;
    private List<ILocation> möglicheEinsatzorte;
    private List<Unterstützungsaktivität> angeboteneAktivitäten;
    private LocalDateTime verfügbarVon;
    private LocalDateTime verfügbarBis;
    private List<Fähigkeit> fähigkeiten;
    private List<Ausrüstung> ausrüstung;
    private FreiwilligenStatus status = FreiwilligenStatus.VERFÜGBAR;
    private Hilfsgesuch zugewiesenesGesuch;

}
