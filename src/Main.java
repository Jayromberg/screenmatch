import br.com.screenmatch.calculator.TimeCalculator;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        Series mySeries = new Series();

        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        mySeries.setName("Lost");
        mySeries.setReleaseYear(2000);
        mySeries.setSeasons(10);
        mySeries.setEpisodesBySeason(10);
        mySeries.setMinutesPerEpisode(50);

        myMovie.evaluate(10);
        myMovie.evaluate(5);
        myMovie.evaluate(3.5);

        mySeries.evaluate(10);
        mySeries.evaluate(5);
        mySeries.evaluate(3.5);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(myMovie);
        calculator.add(mySeries);

        myMovie.displayTechnicalSheet();
        System.out.println("*****************************");
        mySeries.displayTechnicalSheet();
        System.out.println("Duração do série: " + mySeries.getDurationInMinutes());
        System.out.println("calculator.getTotalTime() = " + calculator.getTotalTime());
    }
}
