package com.mygdx.game.Objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;


public class Mundo {
    Nave nave;
    Alien alien;
    Space space;
    int worldwidth, worldheight;

    public Mundo(int worldwidth, int worldheight) {
        this.worldwidth=worldwidth;
        this.worldheight=worldheight;
    }

    public void  construir(){
        space=new Space();
        nave = new Nave();
    }
    public void controlcolision(){
        if (nave.x < 0){
            nave.x=0;
        }else if ((nave.x+24)>worldwidth){
            nave.x=worldwidth-24;
        }

    }
    public void  render(SpriteBatch batch, Assets assets, float delta){
        update(delta);
        space.render(batch,assets);
        nave.render(batch,assets);
    }
    void update(float delta){
        nave.update(delta);
        space.update(delta);
        controlcolision();

    }


}
