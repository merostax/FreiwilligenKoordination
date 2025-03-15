package models;

import java.time.LocalDateTime;

public class Schicht {
    private LocalDateTime start;
    private LocalDateTime ende;
    private int benötigteHelfer;

    public Schicht(LocalDateTime start, LocalDateTime ende, int benötigte) {
        this.start = start;
        this.ende = ende;
        this.benötigteHelfer = benötigte;
    }

}