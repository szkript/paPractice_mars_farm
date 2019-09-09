package com.codecool.mars;

public class Spruce extends Evergreen implements GrowShroom {
    private static final int DEFAULT_MONTHLY_PRODUCTION = 26;
    public static int SHROOM_CHANCE_TO_GROW_PERCENT = 5;

    public Spruce() {
        this.monthlyProduction = DEFAULT_MONTHLY_PRODUCTION;

    }

    @Override
    public void grow() {
        growShroom();
        super.grow();
    }

    @Override
    public void growShroom() {
        int chance = Util.random.nextInt(100);
        if (chance <= SHROOM_CHANCE_TO_GROW_PERCENT){
            System.out.println("SHROOOOM");
        }
    }
}
