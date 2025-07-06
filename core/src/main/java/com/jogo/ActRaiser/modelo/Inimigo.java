package com.jogo.ActRaiser.modelo;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Inimigo extends Entidade{

    public Inimigo(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY, Texture texture,
            Rectangle hitbox, int pontosVida, int pontosMagia, int pontosDano) {
        super(posicaoX, posicaoY, velocidadeX, velocidadeY, texture, hitbox, pontosVida, pontosMagia, pontosDano);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        System.out.println("TesteInimigo");
    }

    @Override
    public void colisao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'colisao'");
    }

    @Override
    public void adicionaPontosVida(int pontosVida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionaPontosVida'");
    }

    @Override
    public void removePontosVida(int pontosDano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePontosVida'");
    }

    @Override
    public void adicionaPontosMagia(int pontosMagia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionaPontosMagia'");
    }

    @Override
    public void removePontosMagia(int pontosMagia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePontosMagia'");
    }

    @Override
    public void adicionaPontosDano(int pontosDano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionaPontosDano'");
    }

}
