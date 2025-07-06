package com.jogo.ActRaiser.modelos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entidade extends Movel {
    protected final int pontosVida, pontosMagia, pontosDano;

    public Entidade(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY, Texture texture,
            Rectangle hitbox, int pontosVida, int pontosMagia, int pontosDano) {
        super(posicaoX, posicaoY, velocidadeX, velocidadeY, texture, hitbox);
        this.pontosVida = pontosVida;
        this.pontosMagia = pontosMagia;
        this.pontosDano = pontosDano;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getPontosMagia() {
        return pontosMagia;
    }

    public int getPontosDano() {
        return pontosDano;
    }

    public abstract void adicionaPontosVida(int pontosVida);

    public abstract void removePontosVida(int pontosDano);

    public abstract void adicionaPontosMagia(int pontosMagia);

    public abstract void removePontosMagia(int pontosMagia);

    public abstract void adicionaPontosDano(int pontosDano);
}
