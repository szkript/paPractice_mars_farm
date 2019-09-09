package com.codecool.mars;

import java.util.HashSet;
import java.util.Set;

public class Farm {
    private int totalProduction = 0;
    private Set<Plant> plants = new HashSet<>();

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void operate(int numOfMonths){
        for (int month = 0; month <= numOfMonths; month++){
            System.out.println(month);
        }
    }


}
