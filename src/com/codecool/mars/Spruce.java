package com.codecool.mars;

public class Spruce extends Evergreen implements GrowShroom, Rottable {
    private static final int DEFAULT_MONTHLY_PRODUCTION = 26;
    private static final int ROT_CHANCE = 4;
    private static final int SHROOM_CHANCE_TO_GROW_PERCENT = 5;
    private static final int ROT_DECAY = 20;


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
            System.out.println(this.getClass().getSimpleName() + " __SHROOOOM");
            this.monthlyProductionGrow += 15;
        }
    }

    @Override
    public boolean isRotten() {
        boolean isRotten = false;
        int chance = Util.random.nextInt(100);
        if (chance <= ROT_CHANCE){
            System.out.println(this.getClass().getSimpleName() + " ******is rotted");
            this.monthlyProduction -= ROT_DECAY;
            isRotten = true;
        }
        return isRotten;
    }
}
