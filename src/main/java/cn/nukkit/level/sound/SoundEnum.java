package cn.nukkit.level.sound;

/**
 * @author CreeperFace
 */
public enum SoundEnum {
    AMBIENT_WEATHER_THUNDER("ambient.weather.thunder"),
    AMBIENT_WEATHER_LIGHTNING_IMPACT("ambient.weather.lightning.impact"),
    AMBIENT_WEATHER_RAIN("ambient.weather.rain"),
    BLOCK_FALSE_PERMISSIONS("block.false_permissions"),
    BLOCK_END_PORTAL_SPAWN("block.end_portal.spawn"),
    BLOCK_END_PORTAL_FRAME_FILL("block.end_portal_frame.fill"),
    BLOCK_ITEMFRAME_ADD_ITEM("block.itemframe.add_item"),
    BLOCK_ITEMFRAME_BREAK("block.itemframe.break"),
    BLOCK_ITEMFRAME_PLACE("block.itemframe.place"),
    BLOCK_ITEMFRAME_REMOVE_ITEM("block.itemframe.remove_item"),
    BLOCK_ITEMFRAME_ROTATE_ITEM("block.itemframe.rotate_item"),
    BLOCK_CHORUSFLOWER_DEATH("block.chorusflower.death"),
    BLOCK_CHORUSFLOWER_GROW("block.chorusflower.grow"),
    BUCKET_EMPTY_LAVA("bucket.empty_lava"),
    BUCKET_EMPTY_WATER("bucket.empty_water"),
    BUCKET_FILL_LAVA("bucket.fill_lava"),
    BUCKET_FILL_WATER("bucket.fill_water"),
    CAULDRON_EXPLODE("cauldron.explode"),
    CAULDRON_DYEARMOR("cauldron.dyearmor"),
    CAULDRON_CLEANARMOR("cauldron.cleanarmor"),
    CAULDRON_CLEANBANNER("cauldron.cleanbanner"),
    CAULDRON_FILLPOTION("cauldron.fillpotion"),
    CAULDRON_TAKEPOTION("cauldron.takepotion"),
    CAULDRON_FILLWATER("cauldron.fillwater"),
    CAULDRON_TAKEWATER("cauldron.takewater"),
    CAULDRON_ADDDYE("cauldron.adddye"),
    DAMAGE_FALLBIG("damage.fallbig"),
    DAMAGE_FALLSMALL("damage.fallsmall"),
    ELYTRA_LOOP("elytra.loop"),
    GAME_PLAYER_ATTACK_NODAMAGE("game.player.attack.nodamage"),
    GAME_PLAYER_HURT("game.player.hurt"),
    GAME_PLAYER_DIE("game.player.die"),
    DIG_CLOTH("dig.cloth"),
    DIG_GRASS("dig.grass"),
    DIG_GRAVEL("dig.gravel"),
    DIG_SAND("dig.sand"),
    DIG_SNOW("dig.snow"),
    DIG_STONE("dig.stone"),
    DIG_WOOD("dig.wood"),
    TILE_PISTON_IN("tile.piston.in"),
    TILE_PISTON_OUT("tile.piston.out"),
    FIRE_FIRE("fire.fire"),
    FIRE_IGNITE("fire.ignite"),
    LEASHKNOT_BREAK("leashknot.break"),
    LEASHKNOT_PLACE("leashknot.place"),
    FIREWORK_BLAST("firework.blast"),
    FIREWORK_LARGE_BLAST("firework.large_blast"),
    FIREWORK_LAUNCH("firework.launch"),
    FIREWORK_SHOOT("firework.shoot"),
    FIREWORK_TWINKLE("firework.twinkle"),
    LIQUID_LAVA("liquid.lava"),
    LIQUID_LAVAPOP("liquid.lavapop"),
    LIQUID_WATER("liquid.water"),
    MINECART_BASE("minecart.base"),
    MINECART_INSIDE("minecart.inside"),
    MOB_ARMOR_STAND_BREAK("mob.armor_stand.break"),
    MOB_ARMOR_STAND_HIT("mob.armor_stand.hit"),
    MOB_ARMOR_STAND_LAND("mob.armor_stand.land"),
    MOB_ARMOR_STAND_PLACE("mob.armor_stand.place"),
    MOB_BAT_DEATH("mob.bat.death"),
    MOB_BAT_HURT("mob.bat.hurt"),
    MOB_BAT_IDLE("mob.bat.idle"),
    MOB_BAT_TAKEOFF("mob.bat.takeoff"),
    MOB_BLAZE_BREATHE("mob.blaze.breathe"),
    MOB_BLAZE_DEATH("mob.blaze.death"),
    MOB_BLAZE_HIT("mob.blaze.hit"),
    MOB_BLAZE_SHOOT("mob.blaze.shoot"),
    MOB_CHICKEN_HURT("mob.chicken.hurt"),
    MOB_CHICKEN_PLOP("mob.chicken.plop"),
    MOB_CHICKEN_SAY("mob.chicken.say"),
    MOB_CHICKEN_STEP("mob.chicken.step"),
    MOB_COW_HURT("mob.cow.hurt"),
    MOB_COW_SAY("mob.cow.say"),
    MOB_COW_STEP("mob.cow.step"),
    MOB_COW_MILK("mob.cow.milk"),
    MOB_CREEPER_DEATH("mob.creeper.death"),
    MOB_CREEPER_SAY("mob.creeper.say"),
    MOB_ENDERMEN_DEATH("mob.endermen.death"),
    MOB_ENDERMEN_HIT("mob.endermen.hit"),
    MOB_ENDERMEN_IDLE("mob.endermen.idle"),
    MOB_ENDERMEN_PORTAL("mob.endermen.portal"),
    MOB_ENDERMEN_SCREAM("mob.endermen.scream"),
    MOB_ENDERMEN_STARE("mob.endermen.stare"),
    MOB_ENDERDRAGON_DEATH("mob.enderdragon.death"),
    MOB_ENDERDRAGON_HIT("mob.enderdragon.hit"),
    MOB_ENDERDRAGON_FLAP("mob.enderdragon.flap"),
    MOB_ENDERDRAGON_GROWL("mob.enderdragon.growl"),
    MOB_GHAST_AFFECTIONATE_SCREAM("mob.ghast.affectionate_scream"),
    MOB_GHAST_CHARGE("mob.ghast.charge"),
    MOB_GHAST_DEATH("mob.ghast.death"),
    MOB_GHAST_FIREBALL("mob.ghast.fireball"),
    MOB_GHAST_MOAN("mob.ghast.moan"),
    MOB_GHAST_SCREAM("mob.ghast.scream"),
    MOB_GUARDIAN_AMBIENT("mob.guardian.ambient"),
    MOB_GUARDIAN_ATTACK_LOOP("mob.guardian.attack_loop"),
    MOB_ELDERGUARDIAN_CURSE("mob.elderguardian.curse"),
    MOB_ELDERGUARDIAN_DEATH("mob.elderguardian.death"),
    MOB_ELDERGUARDIAN_HIT("mob.elderguardian.hit"),
    MOB_ELDERGUARDIAN_IDLE("mob.elderguardian.idle"),
    MOB_GUARDIAN_FLOP("mob.guardian.flop"),
    MOB_GUARDIAN_DEATH("mob.guardian.death"),
    MOB_GUARDIAN_HIT("mob.guardian.hit"),
    MOB_GUARDIAN_LAND_DEATH("mob.guardian.land_death"),
    MOB_GUARDIAN_LAND_HIT("mob.guardian.land_hit"),
    MOB_GUARDIAN_LAND_IDLE("mob.guardian.land_idle"),
    MOB_LLAMA_ANGRY("mob.llama.angry"),
    MOB_LLAMA_DEATH("mob.llama.death"),
    MOB_LLAMA_IDLE("mob.llama.idle"),
    MOB_LLAMA_SPIT("mob.llama.spit"),
    MOB_LLAMA_HURT("mob.llama.hurt"),
    MOB_LLAMA_EAT("mob.llama.eat"),
    MOB_LLAMA_STEP("mob.llama.step"),
    MOB_LLAMA_SWAG("mob.llama.swag"),
    MOB_HORSE_ANGRY("mob.horse.angry"),
    MOB_HORSE_ARMOR("mob.horse.armor"),
    MOB_HORSE_BREATHE("mob.horse.breathe"),
    MOB_HORSE_DEATH("mob.horse.death"),
    MOB_HORSE_DONKEY_ANGRY("mob.horse.donkey.angry"),
    MOB_HORSE_DONKEY_DEATH("mob.horse.donkey.death"),
    MOB_HORSE_DONKEY_HIT("mob.horse.donkey.hit"),
    MOB_HORSE_DONKEY_IDLE("mob.horse.donkey.idle"),
    MOB_HORSE_EAT("mob.horse.eat"),
    MOB_HORSE_GALLOP("mob.horse.gallop"),
    MOB_HORSE_HIT("mob.horse.hit"),
    MOB_HORSE_IDLE("mob.horse.idle"),
    MOB_HORSE_JUMP("mob.horse.jump"),
    MOB_HORSE_LAND("mob.horse.land"),
    MOB_HORSE_LEATHER("mob.horse.leather"),
    MOB_HORSE_SKELETON_DEATH("mob.horse.skeleton.death"),
    MOB_HORSE_SKELETON_HIT("mob.horse.skeleton.hit"),
    MOB_HORSE_SKELETON_IDLE("mob.horse.skeleton.idle"),
    MOB_HORSE_SOFT("mob.horse.soft"),
    MOB_HORSE_WOOD("mob.horse.wood"),
    MOB_HORSE_ZOMBIE_DEATH("mob.horse.zombie.death"),
    MOB_HORSE_ZOMBIE_HIT("mob.horse.zombie.hit"),
    MOB_HORSE_ZOMBIE_IDLE("mob.horse.zombie.idle"),
    MOB_HUSK_AMBIENT("mob.husk.ambient"),
    MOB_HUSK_DEATH("mob.husk.death"),
    MOB_HUSK_HURT("mob.husk.hurt"),
    MOB_HUSK_STEP("mob.husk.step"),
    MOB_IRONGOLEM_THROW("mob.irongolem.throw"),
    MOB_IRONGOLEM_DEATH("mob.irongolem.death"),
    MOB_IRONGOLEM_HIT("mob.irongolem.hit"),
    MOB_IRONGOLEM_WALK("mob.irongolem.walk"),
    MOB_SHULKER_AMBIENT("mob.shulker.ambient"),
    MOB_SHULKER_CLOSE("mob.shulker.close"),
    MOB_SHULKER_DEATH("mob.shulker.death"),
    MOB_SHULKER_CLOSE_HURT("mob.shulker.close.hurt"),
    MOB_SHULKER_HURT("mob.shulker.hurt"),
    MOB_SHULKER_OPEN("mob.shulker.open"),
    MOB_SHULKER_SHOOT("mob.shulker.shoot"),
    MOB_SHULKER_TELEPORT("mob.shulker.teleport"),
    MOB_SHULKER_BULLET_HIT("mob.shulker.bullet.hit"),
    MOB_MAGMACUBE_BIG("mob.magmacube.big"),
    MOB_MAGMACUBE_JUMP("mob.magmacube.jump"),
    MOB_MAGMACUBE_SMALL("mob.magmacube.small"),
    MOB_PARROT_IDLE("mob.parrot.idle"),
    MOB_PARROT_HURT("mob.parrot.hurt"),
    MOB_PARROT_DEATH("mob.parrot.death"),
    MOB_PARROT_STEP("mob.parrot.step"),
    MOB_PARROT_EAT("mob.parrot.eat"),
    MOB_PARROT_FLY("mob.parrot.fly"),
    MOB_PIG_DEATH("mob.pig.death"),
    MOB_PIG_BOOST("mob.pig.boost"),
    MOB_PIG_SAY("mob.pig.say"),
    MOB_PIG_STEP("mob.pig.step"),
    MOB_RABBIT_HURT("mob.rabbit.hurt"),
    MOB_RABBIT_IDLE("mob.rabbit.idle"),
    MOB_RABBIT_HOP("mob.rabbit.hop"),
    MOB_RABBIT_DEATH("mob.rabbit.death"),
    MOB_SHEEP_SAY("mob.sheep.say"),
    MOB_SHEEP_SHEAR("mob.sheep.shear"),
    MOB_SHEEP_STEP("mob.sheep.step"),
    MOB_SILVERFISH_HIT("mob.silverfish.hit"),
    MOB_SILVERFISH_KILL("mob.silverfish.kill"),
    MOB_SILVERFISH_SAY("mob.silverfish.say"),
    MOB_SILVERFISH_STEP("mob.silverfish.step"),
    MOB_ENDERMITE_HIT("mob.endermite.hit"),
    MOB_ENDERMITE_KILL("mob.endermite.kill"),
    MOB_ENDERMITE_SAY("mob.endermite.say"),
    MOB_ENDERMITE_STEP("mob.endermite.step"),
    MOB_SKELETON_DEATH("mob.skeleton.death"),
    MOB_SKELETON_HURT("mob.skeleton.hurt"),
    MOB_SKELETON_SAY("mob.skeleton.say"),
    MOB_SKELETON_STEP("mob.skeleton.step"),
    MOB_SLIME_BIG("mob.slime.big"),
    MOB_SLIME_SMALL("mob.slime.small"),
    MOB_SLIME_ATTACK("mob.slime.attack"),
    MOB_SLIME_DEATH("mob.slime.death"),
    MOB_SLIME_HURT("mob.slime.hurt"),
    MOB_SLIME_JUMP("mob.slime.jump"),
    MOB_SLIME_SQUISH("mob.slime.squish"),
    MOB_SNOWGOLEM_DEATH("mob.snowgolem.death"),
    MOB_SNOWGOLEM_HURT("mob.snowgolem.hurt"),
    MOB_SNOWGOLEM_SHOOT("mob.snowgolem.shoot"),
    MOB_SPIDER_DEATH("mob.spider.death"),
    MOB_SPIDER_SAY("mob.spider.say"),
    MOB_SPIDER_STEP("mob.spider.step"),
    MOB_SQUID_AMBIENT("mob.squid.ambient"),
    MOB_SQUID_DEATH("mob.squid.death"),
    MOB_SQUID_HURT("mob.squid.hurt"),
    MOB_STRAY_AMBIENT("mob.stray.ambient"),
    MOB_STRAY_DEATH("mob.stray.death"),
    MOB_STRAY_HURT("mob.stray.hurt"),
    MOB_STRAY_STEP("mob.stray.step"),
    MOB_VILLAGER_DEATH("mob.villager.death"),
    MOB_VILLAGER_HAGGLE("mob.villager.haggle"),
    MOB_VILLAGER_HIT("mob.villager.hit"),
    MOB_VILLAGER_IDLE("mob.villager.idle"),
    MOB_VILLAGER_NO("mob.villager.no"),
    MOB_VILLAGER_YES("mob.villager.yes"),
    MOB_VINDICATOR_DEATH("mob.vindicator.death"),
    MOB_VINDICATOR_HURT("mob.vindicator.hurt"),
    MOB_VINDICATOR_IDLE("mob.vindicator.idle"),
    MOB_EVOCATION_FANGS_ATTACK("mob.evocation_fangs.attack"),
    MOB_EVOCATION_ILLAGER_AMBIENT("mob.evocation_illager.ambient"),
    MOB_EVOCATION_ILLAGER_CAST_SPELL("mob.evocation_illager.cast_spell"),
    MOB_EVOCATION_ILLAGER_DEATH("mob.evocation_illager.death"),
    MOB_EVOCATION_ILLAGER_HURT("mob.evocation_illager.hurt"),
    MOB_EVOCATION_ILLAGER_PREPARE_ATTACK("mob.evocation_illager.prepare_attack"),
    MOB_EVOCATION_ILLAGER_PREPARE_SUMMON("mob.evocation_illager.prepare_summon"),
    MOB_EVOCATION_ILLAGER_PREPARE_WOLOLO("mob.evocation_illager.prepare_wololo"),
    MOB_VEX_AMBIENT("mob.vex.ambient"),
    MOB_VEX_DEATH("mob.vex.death"),
    MOB_VEX_HURT("mob.vex.hurt"),
    MOB_VEX_CHARGE("mob.vex.charge"),
    MOB_WITCH_AMBIENT("mob.witch.ambient"),
    MOB_WITCH_DEATH("mob.witch.death"),
    MOB_WITCH_HURT("mob.witch.hurt"),
    MOB_WITCH_DRINK("mob.witch.drink"),
    MOB_WITCH_THROW("mob.witch.throw"),
    MOB_WITHER_AMBIENT("mob.wither.ambient"),
    MOB_WITHER_BREAK_BLOCK("mob.wither.break_block"),
    MOB_WITHER_DEATH("mob.wither.death"),
    MOB_WITHER_HURT("mob.wither.hurt"),
    MOB_WITHER_SHOOT("mob.wither.shoot"),
    MOB_WITHER_SPAWN("mob.wither.spawn"),
    MOB_WOLF_BARK("mob.wolf.bark"),
    MOB_WOLF_DEATH("mob.wolf.death"),
    MOB_WOLF_GROWL("mob.wolf.growl"),
    MOB_WOLF_HURT("mob.wolf.hurt"),
    MOB_WOLF_PANTING("mob.wolf.panting"),
    MOB_WOLF_SHAKE("mob.wolf.shake"),
    MOB_WOLF_STEP("mob.wolf.step"),
    MOB_WOLF_WHINE("mob.wolf.whine"),
    MOB_CAT_HISS("mob.cat.hiss"),
    MOB_CAT_HIT("mob.cat.hit"),
    MOB_CAT_MEOW("mob.cat.meow"),
    MOB_CAT_PURR("mob.cat.purr"),
    MOB_CAT_PURREOW("mob.cat.purreow"),
    MOB_POLARBEAR_BABY_IDLE("mob.polarbear_baby.idle"),
    MOB_POLARBEAR_IDLE("mob.polarbear.idle"),
    MOB_POLARBEAR_STEP("mob.polarbear.step"),
    MOB_POLARBEAR_WARNING("mob.polarbear.warning"),
    MOB_POLARBEAR_HURT("mob.polarbear.hurt"),
    MOB_POLARBEAR_DEATH("mob.polarbear.death"),
    MOB_ZOMBIE_DEATH("mob.zombie.death"),
    MOB_ZOMBIE_HURT("mob.zombie.hurt"),
    MOB_ZOMBIE_REMEDY("mob.zombie.remedy"),
    MOB_ZOMBIE_UNFECT("mob.zombie.unfect"),
    MOB_ZOMBIE_SAY("mob.zombie.say"),
    MOB_ZOMBIE_STEP("mob.zombie.step"),
    MOB_ZOMBIE_WOOD("mob.zombie.wood"),
    MOB_ZOMBIE_WOODBREAK("mob.zombie.woodbreak"),
    MOB_ZOMBIEPIG_ZPIG("mob.zombiepig.zpig"),
    MOB_ZOMBIEPIG_ZPIGANGRY("mob.zombiepig.zpigangry"),
    MOB_ZOMBIEPIG_ZPIGDEATH("mob.zombiepig.zpigdeath"),
    MOB_ZOMBIEPIG_ZPIGHURT("mob.zombiepig.zpighurt"),
    MOB_ZOMBIE_VILLAGER_SAY("mob.zombie_villager.say"),
    MOB_ZOMBIE_VILLAGER_DEATH("mob.zombie_villager.death"),
    MOB_ZOMBIE_VILLAGER_HURT("mob.zombie_villager.hurt"),
    NOTE_BASS("note.bass"),
    NOTE_BASSATTACK("note.bassattack"),
    NOTE_BD("note.bd"),
    NOTE_HARP("note.harp"),
    NOTE_HAT("note.hat"),
    NOTE_PLING("note.pling"),
    NOTE_SNARE("note.snare"),
    PORTAL_PORTAL("portal.portal"),
    PORTAL_TRAVEL("portal.travel"),
    PORTAL_TRIGGER("portal.trigger"),
    RANDOM_ANVIL_BREAK("random.anvil_break"),
    RANDOM_ANVIL_LAND("random.anvil_land"),
    RANDOM_ANVIL_USE("random.anvil_use"),
    RANDOM_BOW("random.bow"),
    RANDOM_BOWHIT("random.bowhit"),
    RANDOM_BREAK("random.break"),
    RANDOM_BURP("random.burp"),
    RANDOM_CHESTCLOSED("random.chestclosed"),
    RANDOM_CHESTOPEN("random.chestopen"),
    RANDOM_SHULKERBOXCLOSED("random.shulkerboxclosed"),
    RANDOM_SHULKERBOXOPEN("random.shulkerboxopen"),
    RANDOM_CLICK("random.click"),
    RANDOM_DOOR_CLOSE("random.door_close"),
    RANDOM_DOOR_OPEN("random.door_open"),
    RANDOM_DRINK("random.drink"),
    RANDOM_EAT("random.eat"),
    RANDOM_EXPLODE("random.explode"),
    RANDOM_FIZZ("random.fizz"),
    RANDOM_FUSE("random.fuse"),
    RANDOM_GLASS("random.glass"),
    RANDOM_LEVELUP("random.levelup"),
    RANDOM_ORB("random.orb"),
    RANDOM_POP("random.pop"),
    RANDOM_POP2("random.pop2"),
    RANDOM_SPLASH("random.splash"),
    RANDOM_SWIM("random.swim"),
    RANDOM_HURT("random.hurt"),
    RANDOM_TOAST("random.toast"),
    RANDOM_TOTEM("random.totem"),
    CAMERA_TAKE_PICTURE("camera.take_picture"),
    USE_LADDER("use.ladder"),
    HIT_LADDER("hit.ladder"),
    FALL_LADDER("fall.ladder"),
    STEP_LADDER("step.ladder"),
    USE_CLOTH("use.cloth"),
    HIT_CLOTH("hit.cloth"),
    FALL_CLOTH("fall.cloth"),
    STEP_CLOTH("step.cloth"),
    USE_GRASS("use.grass"),
    HIT_GRASS("hit.grass"),
    FALL_GRASS("fall.grass"),
    STEP_GRASS("step.grass"),
    USE_GRAVEL("use.gravel"),
    HIT_GRAVEL("hit.gravel"),
    FALL_GRAVEL("fall.gravel"),
    STEP_GRAVEL("step.gravel"),
    USE_SAND("use.sand"),
    HIT_SAND("hit.sand"),
    FALL_SAND("fall.sand"),
    STEP_SAND("step.sand"),
    USE_SLIME("use.slime"),
    HIT_SLIME("hit.slime"),
    FALL_SLIME("fall.slime"),
    STEP_SLIME("step.slime"),
    USE_SNOW("use.snow"),
    HIT_SNOW("hit.snow"),
    FALL_SNOW("fall.snow"),
    STEP_SNOW("step.snow"),
    USE_STONE("use.stone"),
    HIT_STONE("hit.stone"),
    FALL_STONE("fall.stone"),
    STEP_STONE("step.stone"),
    USE_WOOD("use.wood"),
    HIT_WOOD("hit.wood"),
    FALL_WOOD("fall.wood"),
    STEP_WOOD("step.wood"),
    JUMP_CLOTH("jump.cloth"),
    JUMP_GRASS("jump.grass"),
    JUMP_GRAVEL("jump.gravel"),
    JUMP_SAND("jump.sand"),
    JUMP_SNOW("jump.snow"),
    JUMP_STONE("jump.stone"),
    JUMP_WOOD("jump.wood"),
    JUMP_SLIME("jump.slime"),
    LAND_CLOTH("land.cloth"),
    LAND_GRASS("land.grass"),
    LAND_GRAVEL("land.gravel"),
    LAND_SAND("land.sand"),
    LAND_SNOW("land.snow"),
    LAND_STONE("land.stone"),
    LAND_WOOD("land.wood"),
    LAND_SLIME("land.slime"),
    VR_STUTTERTURN("vr.stutterturn"),
    RECORD_13("record.13"),
    RECORD_CAT("record.cat"),
    RECORD_BLOCKS("record.blocks"),
    RECORD_CHIRP("record.chirp"),
    RECORD_FAR("record.far"),
    RECORD_MALL("record.mall"),
    RECORD_MELLOHI("record.mellohi"),
    RECORD_STAL("record.stal"),
    RECORD_STRAD("record.strad"),
    RECORD_WARD("record.ward"),
    RECORD_11("record.11"),
    RECORD_WAIT("record.wait"),
    MUSIC_MENU("music.menu"),
    MUSIC_GAME("music.game"),
    MUSIC_GAME_CREATIVE("music.game.creative"),
    MUSIC_GAME_END("music.game.end"),
    MUSIC_GAME_ENDBOSS("music.game.endboss"),
    MUSIC_GAME_NETHER("music.game.nether"),
    MUSIC_GAME_CREDITS("music.game.credits");

    private final String sound;

    SoundEnum(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
}