package com.jogo.ActRaiser;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jogo.ActRaiser.modelo.Player;
import com.jogo.ActRaiser.modelo.PlayerBuilder;

public class GameRunner extends ApplicationAdapter {
    private SpriteBatch batch;
    Director director = new Director();
    PlayerBuilder playerBuilder = new PlayerBuilder();
    Player player;

    @Override
    public void create() {
        batch = new SpriteBatch();
        director.constructorPlayer(playerBuilder);
        player = playerBuilder.buildPlayer();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(player.getTexture(), player.getPosicaoX(), player.getPosicaoY());
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
