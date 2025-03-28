package calculos;

import com.streamSRGT.models.Title;

public class Calculator{
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Title titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
