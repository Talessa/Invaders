package com.mygdx.game.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.Objects.Mundo;
import com.mygdx.game.Spaceinvaders1;

public class GameScreen extends InvadersScreen {

    int worldwidth=512;
    int worldheight=384;
    Mundo mundo;
    OrthographicCamera camera;
    FitViewport fitViewport;
    GameScreen(Spaceinvaders1 game) {
        super(game);
    }
    @Override
    public void show(){
        camera= new OrthographicCamera();
        camera.position.x=worldwidth/2;
        camera.position.y=worldheight/2;
        camera.update();
        fitViewport= new FitViewport(worldwidth,worldheight,camera);
        fitViewport.apply();
        mundo=new Mundo(worldwidth,worldheight);
        mundo.construir();
    }
    @Override
    public void render(float delta){


        game.batch.begin();
        game.batch.setProjectionMatrix(camera.combined);
        mundo.render(game.batch, game.assets,delta);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        fitViewport.update(width,height);
    }
}
