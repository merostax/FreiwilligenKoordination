package interfaces;

public abstract class Person {
    private String name;
    private String adresse;
    private String telefon;

    public Person(String name, String adresse, String telefon) {
        this.name = name;
        this.adresse = adresse;
        this.telefon = telefon;
    }

}
