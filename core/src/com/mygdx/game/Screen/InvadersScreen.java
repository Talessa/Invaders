package com.mygdx.game.Screen;

import com.badlogic.gdx.Screen;
import com.mygdx.game.Assets;
import com.mygdx.game.Spaceinvaders1;

public class InvadersScreen implements Screen {

    Spaceinvaders1 game;
    Assets assets;

    InvadersScreen (Spaceinvaders1 game){
        this.game= game;
        this.assets = game.assets;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
