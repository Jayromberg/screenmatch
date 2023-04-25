import domain.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        myMovie.evaluate(10);
        myMovie.evaluate(5);
        myMovie.evaluate(3.5);

        myMovie.displayTechnicalSheet();
    }
}
