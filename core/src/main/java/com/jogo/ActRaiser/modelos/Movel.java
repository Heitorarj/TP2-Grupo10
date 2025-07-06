package com.jogo.ActRaiser.modelos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Movel {
    protected final float posicaoX, posicaoY, velocidadeX, velocidadeY;
    protected final Texture texture;
    protected final Rectangle hitbox;

    public Movel(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY, Texture texture,
            Rectangle hitbox) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;
        this.texture = texture;
        this.hitbox = hitbox;
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

    public Texture getTexture() {
        return texture;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public abstract void mover();

    public abstract void colisao();
}
