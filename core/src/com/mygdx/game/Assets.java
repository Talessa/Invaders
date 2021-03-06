package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets extends AssetManager {

    public TextureAtlas atlas;
    public Animation<TextureRegion> alien, naveidle,space;


    void load(){
        load("invaders.atlas", TextureAtlas.class);
    }
    @Override
    public synchronized boolean update() {
        boolean update = super.update();

        if(update){
            atlas = get("invaders.atlas", TextureAtlas.class);

            loadAnimations();
        }
        return update;
    }

    void loadAnimations(){
        alien = new Animation<TextureRegion>(0.1f, atlas.findRegions("gatilen"));
        naveidle = new Animation<TextureRegion>(0.1f, atlas.findRegions("naveidle"));
        space = new Animation<TextureRegion>(1f, atlas.findRegions("space"));
    }
}
