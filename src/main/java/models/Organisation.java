package models;

import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Organisation {
    private String name;
    private List<Einsatzleiter> einsatzleiter;

    public void addEinsatzleiter(Einsatzleiter leiter) {
        einsatzleiter.add(leiter);
    }

}
