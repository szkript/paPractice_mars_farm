package com.codecool.mars;

public class Spruce extends Evergreen implements GrowShroom, Rottable {
    private static final int DEFAULT_MONTHLY_PRODUCTION = 26;
    private static final int ROT_CHANCE = 4;
    public static int SHROOM_CHANCE_TO_GROW_PERCENT = 5;

    public Spruce() {
        this.monthlyProduction = DEFAULT_MONTHLY_PRODUCTION;

    }

    @Override
    public void grow() {
        growShroom();
        rot();
        super.grow();
    }

    @Override
    public void growShroom() {
        int chance = Util.random.nextInt(100);
        if (chance <= SHROOM_CHANCE_TO_GROW_PERCENT){
            System.out.println("SHROOOOM");
        }
    }

    @Override
    public void rot() {
        int chance = Util.random.nextInt(100);
        if (chance <= ROT_CHANCE){
            System.out.println(this.getClass().getSimpleName() + " is rotted");
        }
    }
}
