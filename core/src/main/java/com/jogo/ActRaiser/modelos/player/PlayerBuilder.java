package com.jogo.ActRaiser.modelos.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.jogo.ActRaiser.interfaces.Builder;

public class PlayerBuilder implements Builder {
    protected float posicaoX, posicaoY, velocidadeX, velocidadeY;
    protected int pontosVida, pontosMagia, pontosDano;
    protected Texture texture;
    protected Rectangle hitbox;

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }
    public void setVelocidadeX(float velocidadeX) {
        this.velocidadeX = velocidadeX;
    }
    public void setVelocidadeY(float velocidadeY) {
        this.velocidadeY = velocidadeY;
    }
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    public void setPontosMagia(int pontosMagia) {
        this.pontosMagia = pontosMagia;
    }
    public void setPontosDano(int pontosDano) {
        this.pontosDano = pontosDano;
    }
    public void setTexture(Texture texture) {
        this.texture = texture;
    }
    public void setHitbox(Rectangle hitbox) {
        this.hitbox = hitbox;
    }

    public Player buildPlayer(){
        return new Player(posicaoX, posicaoY, velocidadeX, velocidadeY, texture, hitbox, pontosVida, pontosMagia, pontosDano);
    }
}
