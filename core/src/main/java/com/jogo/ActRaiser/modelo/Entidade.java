package com.jogo.ActRaiser.modelo;

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

    public void adicionaPontosVida(int pontosVida){
        this.pontosVida += pontosVida;
    }

    public void removePontosVida(int pontosDano){
        this.pontosVida -= pontosDano;
    }

    public void adicionaPontosMagia(int pontosMagia){
        this.pontosMagia += pontosMagia;
    }
    
    public void removePontosMagia(int pontosMagia){
        this.pontosMagia -= pontosMagia;
    }

    public void adicionaPontosDano(int pontosDano){
        this.pontosDano += pontosDano;
    }
}
