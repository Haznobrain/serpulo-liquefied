package serpuloLiquefied.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import serpuloLiquefied.entities.bullets.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class Blocks{
    public static Block

    //environment

    //boulders

    //ores

    //wall ores

    //crafting

    //sandbox

    //defense

    //walls

    //transport

    //liquid

    //power

    //production

    //storage

    //turrets
    strike

    //units

    //payloads

    //logic

    //campaign
    ;
    public static void load(){
          strike = new PowerTurret("strike"){{
            requirements(Category.turret, with(Items.copper, 200, Items.titanium, 100, Items.silicon, 100));
            shootType = new SLLightningBulletType(){{
                damage = 50;
                lightningLength = 30;
                stroke = 5f;
                collidesAir = false;
                ammoMultiplier = 1f;
                angleRand = 3f;
                lightningType = new BulletType(0.0001f, 0f){{
                            lifetime = 12;
                            hitEffect = Fx.hitLancer;
                            despawnEffect = Fx.none;
                            status = StatusEffects.shocked;
                            statusDuration = 10f;
                            hittable = false;
                            lightColor = Pal.surge;
                            collidesAir = false;
                            buildingDamageMultiplier = 0.25f;
                        }};
                lightningColor = Pal.surge;
            }};
            reload = 35;
            shootCone = 20;
            rotateSpeed = 4;
            targetAir = false;
            range = 120;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoil = 2f;
            size = 2;
            health = 920;
            shootSound = Sounds.spark;
            consumePower(4.4f);
            coolant = consumeCoolant(0.3f);
          }};
    }
}
