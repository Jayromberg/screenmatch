package domain;

public class Datasheet extends Movie {
    public void displayTechnicalSheet() {
        System.out.println("Nome do filme: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseYear());
    }
}
