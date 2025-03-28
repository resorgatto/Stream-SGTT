import calculos.Calculator;
import calculos.FiltroRecomendacao;
import com.streamSRGT.models.Episodios;
import com.streamSRGT.models.Movie;
import com.streamSRGT.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie mymovie = new Movie();
        mymovie.setNome("Interestelar");
        mymovie.setAnoDeLancamento(2014);
        mymovie.setDuracaoEmMinutos(165);
        System.out.println("Duração do filme em minutos: " + mymovie.getDuracaoEmMinutos());


        mymovie.exibeFichaTecnica();
        mymovie.avalia(9);
        mymovie.avalia(10);
        mymovie.avalia(10);
        System.out.println("Total de avaliações: " + mymovie.getTotalDeAvaliacoes());
        System.out.println(mymovie.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


        Series bb = new Series();
        bb.setNome("Breaking Bad");
        bb.setAnoDeLancamento(2005);
        bb.setTemporadas(5);
        bb.exibeFichaTecnica();
        bb.setEpsPorTemporada(23);
        bb.setMinutosPorEp(50);
        System.out.println("Duração da série por completo: " + bb.getMinutosPorEp());

        Movie movie = new Movie();
        movie.setNome("Velozes e Furiosos: Desafio em Tóquio");
        movie.setAnoDeLancamento(2014);
        movie.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme em minutos: " + mymovie.getDuracaoEmMinutos());



        Calculator calculator = new Calculator();
        calculator.inclui(mymovie);
        calculator.inclui(movie);
        System.out.println(calculator.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(mymovie);
        filtro.filtra(movie);

        Episodios ep = new Episodios();
        ep.setNumero(1);
        ep.setSerie(bb);
        ep.setTotalVisualizações(30000);
        filtro.filtra(ep);

    }
}