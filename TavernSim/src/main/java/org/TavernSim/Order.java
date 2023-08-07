package org.TavernSim;

import java.lang.reflect.Array;
import java.util.*;

public class Order {
    int price;
    int neededMaterials;

    Random rand = new Random();
    int upperbound = 100;
    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();

    String orderName = "Beer"; //static for now
    void orderPlaced(){
        for (int i = 0; i < 2; i++){
            int int_random = rand.nextInt(upperbound);
            randomNumbers.add(int_random);
        }
        price = randomNumbers.get(0);
        neededMaterials = randomNumbers.get(1);
        System.out.println("price is:" + price);

        System.out.println("required materials:" + neededMaterials);

    }
}
