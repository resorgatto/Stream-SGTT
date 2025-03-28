package com.streamSRGT.models;

import calculos.Classificar;

public class Episodios implements Classificar {
    private int numero;
    private String nome;
    private Series serie;
    private int totalVisualizações;

    public void setTotalVisualizações(int totalVisualizações) {
        this.totalVisualizações = totalVisualizações;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizações > 100){
                return 4;
        }else{
            return 2;
        }

    }
}
