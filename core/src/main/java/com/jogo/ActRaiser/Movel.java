package com.jogo.ActRaiser;

import com.badlogic.gdx.graphics.g2d.Sprite;

public abstract class Movel {
    private float posicaoX, posicaoY, velocidadeX, velocidadeY;
    private Sprite sprite;

    public Sprite getSprite() {
        return sprite;
    }

    public float getPosicaoX() {
        return posicaoX;
    }

    public float getPosicaoY() {
        return posicaoY;
    }

    public float getVelocidadeX() {
        return velocidadeX;
    }

    public float getVelocidadeY() {
        return velocidadeY;
    }

    public abstract void mover(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY);
    public abstract void mover(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY, Player player);
}
