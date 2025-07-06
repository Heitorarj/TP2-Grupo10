package com.jogo.ActRaiser;

public abstract class Entidade extends Movel{
    private int pontosVida, pontosMagia, pontosDano;

    public int getPontosVida() {
        return pontosVida;
    }

    public int getPontosMagia() {
        return pontosMagia;
    }

    public int getPontosDano() {
        return pontosDano;
    }
}
