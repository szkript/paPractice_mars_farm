package com.codecool.mars;

import java.util.HashSet;
import java.util.Set;

public class Farm {
    private int totalProduction = 0;
    private Set<Plant> plants = new HashSet<>();

    public void addPlant(Plant plant){
        plants.add(plant);
    }
    protected void harvest(){
        for (Plant plant : plants){
            System.out.println(plant.monthlyProduction);
            totalProduction += plant.monthlyProduction;
            plant.grow();
        }
    }

    public void operate(int numOfMonths){
        for (int month = 0; month <= numOfMonths; month++){
            harvest();
            System.out.println(month + " , " + totalProduction);
        }
    }


}
