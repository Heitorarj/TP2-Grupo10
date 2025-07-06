package com.jogo.ActRaiser.modelo;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public abstract class Movel {
    protected float posicaoX, posicaoY, velocidadeX, velocidadeY;
    protected TextureRegion texture;
    protected Rectangle hitbox;

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
    
    public TextureRegion getTexture() {
        return texture;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public abstract void mover();

    public abstract void colisao();
}
