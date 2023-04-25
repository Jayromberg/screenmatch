package br.com.screenmatch.models;

public class Movie extends Datasheet {
    private  String director;
    public void displayTechnicalSheet() {
        System.out.println("Nome do filme: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseYear());
        System.out.println("Duração do filme: " + getDurationInMinutes());
        System.out.println("Avaliação: %.2f".formatted(getAverage()));
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
