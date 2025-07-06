package com.jogo.ActRaiser;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.jogo.ActRaiser.interfaces.Builder;

public class Director {
    public void constructorPlayer(Builder builder){
        builder.setPosicaoX(300);
        builder.setPosicaoY(400);
        builder.setVelocidadeX(5);
        builder.setVelocidadeY(5);
        builder.setTexture(new Texture(Gdx.files.internal("assets/libgdx.png")));
        builder.setHitbox(new Rectangle(0, 0, 64, 64));
    }

}
