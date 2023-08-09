package org.TavernSim;

import java.lang.reflect.Array;
import java.util.*;

public class Order {
    int price;
    int neededMaterials;
    String orderName = "Beer"; //static for now

    Random rand = new Random();
    int upperbound = 100; //upperbound will not be the same for every drink
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?


    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();

    void orderPlaced(){ //ugly stuff. remove it later
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
