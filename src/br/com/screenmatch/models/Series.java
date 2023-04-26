package br.com.screenmatch.models;

public class Series extends Datasheet {
    private int seasons;
    private boolean active;
    private int episodesBySeason;
    private int minutesPerEpisode;

    public void displayTechnicalSheet() {
        System.out.println("Nome do série: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseYear());
        System.out.println("Duração do série: " + getDurationInMinutes());
        System.out.println("Avaliação: %.2f".formatted(getAverage()));
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesBySeason * minutesPerEpisode;
    }
}
