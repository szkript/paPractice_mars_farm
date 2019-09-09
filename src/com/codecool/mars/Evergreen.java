package com.codecool.mars;

public abstract class Evergreen extends Plant{
    protected static final int PRODUCTION_LIMIT = 70;

    @Override
    public void grow() {
        super.grow();
        if (this.monthlyProduction >= PRODUCTION_LIMIT){
            System.out.println("at full production");
            this.monthlyProduction = PRODUCTION_LIMIT;
            return;
        }
        if (this.passedMonths % 5 == 0){
            this.monthlyProductionGrow += 8;
        }

    }
}
