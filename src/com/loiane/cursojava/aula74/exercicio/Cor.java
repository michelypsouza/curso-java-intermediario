package com.loiane.cursojava.aula74.exercicio;

public enum Cor {

    VERMELHO(1500), AMARELO(200), VERDE(1000);

    private int tempoEsperaSegundos;


    Cor(int tempoEsperaSegundos) {
        this.tempoEsperaSegundos = tempoEsperaSegundos;
    }

    public int getTempoEsperaSegundos() {
        return tempoEsperaSegundos;
    }
}
