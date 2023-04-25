import domain.Datasheet;

public class Main {
    public static void main(String[] args) {
        Datasheet myMovie = new Datasheet();

        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);

        myMovie.displayTechnicalSheet();
    }
}
