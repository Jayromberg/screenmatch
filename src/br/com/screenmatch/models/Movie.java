package br.com.screenmatch.models;

import br.com.screenmatch.interfaces.Classification;

public class Movie extends Datasheet implements Classification {
    private  String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
