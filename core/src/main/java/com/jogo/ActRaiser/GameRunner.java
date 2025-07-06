package com.jogo.ActRaiser;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jogo.ActRaiser.modelos.inimigos.Morcego;
import com.jogo.ActRaiser.modelos.inimigos.MorcegoBuilder;
import com.jogo.ActRaiser.modelos.player.Player;
import com.jogo.ActRaiser.modelos.player.PlayerBuilder;

public class GameRunner extends ApplicationAdapter {
    private SpriteBatch batch;
    private Director director = new Director();
    private PlayerBuilder playerBuilder = new PlayerBuilder();
    private Player player;
    private MorcegoBuilder morcegoBuilder = new MorcegoBuilder();
    private Morcego morcego;

    @Override
    public void create() {
        batch = new SpriteBatch();

        director.constructorPlayer(playerBuilder);
        player = playerBuilder.buildPlayer();

        director.constructorMorcego(morcegoBuilder);
        morcego = morcegoBuilder.buildMorcego();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(player.getTexture(), player.getPosicaoX(), player.getPosicaoY());
        batch.draw(morcego.getTexture(), morcego.getPosicaoX(), morcego.getPosicaoY());
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
