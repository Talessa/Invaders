package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Spaceinvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img1,img2,img3;
	int x=0;
	int y=0;
	boolean izquierda=false;
	float time=0;
	int dibu=0;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img1 = new Texture("gatilen0.png");
		img2 = new Texture("gatilen1.png");
		img3 = new Texture("gatilen2.png");
	}

	@Override
	public void render () {
		if (x==500){
			izquierda = true;
			y+=10;
		}
		if (x == 0) {
			izquierda = false;
			y+=10;
		}
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		time +=Gdx.graphics.getDeltaTime();
		batch.begin();
		if (dibu==0) {
			batch.draw(img1, x, y, 100, 100);
		}else if (dibu==1) {
			batch.draw(img2, x, y, 100, 100);
		}else if (dibu==2) {
			batch.draw(img3, x, y, 100, 100);
		}
		batch.end();
		if (time>=0.2f){
			dibu =(dibu+1)%3;
			time=0;
		}
		if (!izquierda) {
			x++;
		}
		if (izquierda) {
			x--;
		}


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
		img2.dispose();
		img3.dispose();
	}
}
