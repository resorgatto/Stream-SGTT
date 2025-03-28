package com.streamSRGT.models;

import calculos.Classificar;

public class Movie extends Title implements Classificar {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2 ;
    }
}