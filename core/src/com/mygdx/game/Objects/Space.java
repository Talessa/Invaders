package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;

public class Space {


    float stateTime;

    void render(SpriteBatch batch, Assets assets){

        batch.draw(assets.space.getKeyFrame(stateTime,true),0,0);
    }

    public void update(float delta) {
        stateTime+=delta;

    }
}
