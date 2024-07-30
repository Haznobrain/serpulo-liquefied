package serpuloLiquefied.entities;

import arc.graphics*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.entities.bullet.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.world.*;

import static mindustry.Vars.*;

public class CustomLightning{
    private static final Rand random = new Rand();
    private static final Rect rect = new Rect();
    private static final Seq<Unitc> entities = new Seq<>();
    private static final IntSet hit = new IntSet();
    public static Int maxChain = 8;
    public static float hitRange = 30f;
    private static boolean bhit = false;
    private static int lastSeed = 0;

    //**lightning custom at location. */
    public static void create(Team team, Color color, float damage, float x, float y, float targetAngle, int stroke, int length, float ){
        createLightningInternal(null, lastSeed++, bullet.team, color, damage, x, y, targetAngle, length);
    }

    //**bullet parameters one (the one i need lol). */
    public static void create(Bullet bullet, Color color, float damage, float x, float y, float targetAngle, float angleRand, int length, int stroke);
