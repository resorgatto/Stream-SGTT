package calculos;

import com.streamSRGT.models.Title;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificar classficar){
        if (classficar.getClassificacao() >= 4){
            System.out.println("Favoritos da Galera");
        }else if (classficar.getClassificacao() >= 2){
            System.out.println("Vale a pena assistir");
        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }

    }
}
