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
        int tmpProduct = totalProduction;
        for (Plant plant : plants){
            System.out.println(plant.getClass().getSimpleName() + " current prod: " +plant.monthlyProduction);
            totalProduction += plant.monthlyProduction;
            if (plant instanceof Rottable){
                if (((Rottable) plant).isRotten()){
                    totalProduction = tmpProduct;
                    break;
                }
            }
            plant.grow();
        }
    }

    public void operate(int numOfMonths){
        for (int month = 0; month <= numOfMonths; month++){
            int tmp = totalProduction;
            harvest();
            System.out.println("at month " + month + " the total production: " + totalProduction);
            System.out.println("monthly income: " + (totalProduction-tmp));
        }
    }


}
