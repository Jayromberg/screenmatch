import br.com.screenmatch.models.Episode;
import br.com.screenmatch.utils.FilterRecommendations;
import br.com.screenmatch.utils.TimeCalculator;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        Series mySeries = new Series();
        Episode myEpisode = new Episode();
        TimeCalculator calculator = new TimeCalculator();
        FilterRecommendations filterRecommendations = new FilterRecommendations();

        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        mySeries.setName("Lost");
        mySeries.setReleaseYear(2000);
        mySeries.setSeasons(10);
        mySeries.setEpisodesBySeason(10);
        mySeries.setMinutesPerEpisode(50);
        myEpisode.setNumber(1);
        myEpisode.setSeries(mySeries);
        myEpisode.setTotalViews(300);

        myMovie.evaluate(10);
        myMovie.evaluate(5);
        myMovie.evaluate(3.5);

        mySeries.evaluate(10);
        mySeries.evaluate(5);
        mySeries.evaluate(3.5);

        calculator.add(myMovie);
        calculator.add(mySeries);

        myMovie.displayTechnicalSheet();
        filterRecommendations.filter(myMovie);
        System.out.println("*****************************");
        mySeries.displayTechnicalSheet();
        filterRecommendations.filter(myEpisode);
        System.out.println("*****************************");
        System.out.println("calculator.getTotalTime() = " + calculator.getTotalTime());
    }
}
