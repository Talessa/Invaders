package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;

public class Nave {

    int x;
    int speed = 1;
    int vidas;
    float stateTime;

    void render(SpriteBatch batch, Assets assets){

        batch.draw(assets.naveidle.getKeyFrame(stateTime,true),x,0);
    }
    void mover(){
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            x+=speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            x-=speed;
        }
    }
    void disparar(){}
    void morir(){}
    void perdervida(){}

    public void update(float delta) {
        stateTime+=delta;
        mover();
    }
}
