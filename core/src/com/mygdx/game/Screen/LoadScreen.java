package com.mygdx.game.Screen;

import com.mygdx.game.Spaceinvaders1;

public class LoadScreen extends InvadersScreen {

    public LoadScreen(Spaceinvaders1 game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        if (assets.update()){
            game.setScreen(new MenuScreen(game));
        }
    }
}
