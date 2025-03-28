package com.streamSRGT.models;

public class Series extends Title{
    private int temporadas;
    private boolean ativa;
    private int epsPorTemporada;
    private int minutosPorEp;

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsPorTemporada * minutosPorEp;
    }
}
