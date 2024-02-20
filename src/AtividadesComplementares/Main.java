package AtividadesComplementares;

import com.alura.ScreenMatch.Calculate.recommendationFilter;
import com.alura.ScreenMatch.Models.Epsode;
import com.alura.ScreenMatch.Models.Movies;
import com.alura.ScreenMatch.Models.Series;

import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {


        Series suits = new Series();
        suits.setName("Suits");
        suits.setSeasons(9);
        suits.setEpisodesPerSeason(20);


        recommendationFilter filter = new recommendationFilter();
        Epsode ep = new Epsode();
        ep.setNumber(1);
        ep.setSerie(suits);
        ep.setTotalViews(5000);
        filter.filter(ep);

    }
}
