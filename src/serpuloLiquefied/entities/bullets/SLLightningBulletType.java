package serpuloLiquefied.entities.bullets;

import arc.graphics.*;
import arc.math.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import serpuloLiquefied.SLFx.*;

public class SLLightningBulletType extends BulletType{
    public Color lightningColor = Pal.lancerLaser;
    public int lightningLength = 20, lightningLengthRand = 0;

    public SLLightningBulletType(){
        damage = 1f;
        speed = 0f;
        stroke = 3f;
        lifetime = 12;
        despawnEffect = Fx.none;
        hitEffect = Fx.hitLancer;
        keepVelocity = false;
        hittable = false;
        //for stats
        status = StatusEffects.shocked;
        // the random angle wich the lightning goes after each line
        angleRand = 10f;
    }

    @Override
    protected float calculateRange(){
        return (lightningLength + lightningLengthRand/2f) * 6f;
    }

    @Override
    public float estimateDPS(){
        return super.estimateDPS() * Math.max(lightningLength / 10f, 1);
    }

    @Override
    public void draw(Bullet b){
    }

    @Override
    public void init(Bullet b){
        super.init(b);

        SLLightning.create(b, lightningColor, damage, b.x, b.y, b.rotation(), lightningLength + Mathf.random(lightningLengthRand), stroke, angleRand);
    }
}
