package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screen.LoadScreen;
import sun.java2d.pipe.ShapeDrawPipe;

public class Spaceinvaders1 extends Game {

	public Assets assets= new Assets();
	public SpriteBatch batch;

	@Override
	public void create () {
		assets= new Assets();
		assets.load();
		batch = new SpriteBatch();
		setScreen(new LoadScreen(this));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(255, 255, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
	
	@Override
	public void dispose() {


	}
}
