package com.codecool.mars;

public abstract class Plant {
    protected int passedMonths = 0;
    protected int monthlyProduction;
    protected int monthlyProductionGrow = 4;

    public void grow(){
        this.monthlyProduction += monthlyProductionGrow;
        passedMonths++;
    }
}
