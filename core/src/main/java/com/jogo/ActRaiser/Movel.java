package com.jogo.ActRaiser;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public abstract class Movel {
    private float posicaoX, posicaoY, velocidadeX, velocidadeY;
    private TextureRegion texture;
    private Rectangle hitbox;

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

    public abstract void mover(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY);
    
    public abstract void mover(float posicaoX, float posicaoY, float velocidadeX, float velocidadeY, Player player);
}
