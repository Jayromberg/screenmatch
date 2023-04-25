package domain;

public class Movie extends Datasheet {
    public void displayTechnicalSheet() {
        System.out.println("Nome do filme: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseYear());
        System.out.println("Avaliação: " + getAverage());
    }
}
