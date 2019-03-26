package com.mygdx.game.Screen;

import com.mygdx.game.Spaceinvaders1;

public class MenuScreen extends InvadersScreen {

    public MenuScreen(Spaceinvaders1 game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        if (assets.update()){
            game.setScreen(new GameScreen(game));
        }
    }

}
