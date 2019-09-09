package com.codecool.mars;

public class AlmondTree extends Plant implements GrowShroom, Rottable{
    private static final int ROT_CHANCE = 13;
    private static int DEFAULT_MONTHLY_PRODUCTION = 50;
    public static int SHROOM_CHANCE_TO_GROW_PERCENT = 8;


    public AlmondTree() {
        this.monthlyProduction = DEFAULT_MONTHLY_PRODUCTION;
    }

    @Override
    public void grow() {
        growShroom();
        rot();
        super.grow();
        if (monthlyProduction <= 40){
            monthlyProduction += monthlyProductionGrow;
        }
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
            System.out.println(this.getClass().getSimpleName() + " is rotten");
        }
    }
}
