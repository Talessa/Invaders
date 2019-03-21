package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screen.LoadScreen;

public class Spaceinvaders1 extends Game {

	public Assets assets= new Assets();
	@Override
	public void create () {
		assets= new Assets();
		assets.load();
		setScreen(new LoadScreen(this));

	}

	@Override
	public void render () {


	}
	
	@Override
	public void dispose() {


	}
}
