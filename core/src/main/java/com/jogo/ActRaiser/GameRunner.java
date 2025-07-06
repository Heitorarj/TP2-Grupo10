package com.jogo.ActRaiser;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRunner extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Player player = new Player();
    private Inimigo inimigo = new Inimigo();

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(image, 140, 210);
        batch.end();
        
        player.mover(0, 0, 0, 0);
        inimigo.mover(0, 0, 0, 0, player);
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
