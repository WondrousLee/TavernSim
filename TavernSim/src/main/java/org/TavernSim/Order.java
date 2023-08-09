package org.TavernSim;

import java.lang.reflect.Array;
import java.util.*;

public class Order {
    public int priceMin;
    public int priceMax;
    int neededMaterials;
    String orderName = "Beer"; //static for now

    Random rand = new Random();
    //upperbound will not be the same for every drink
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?

    public void orderPlaced(){ //ugly stuff. remove it later
        int priceMin = rand.nextInt(20 - 10) + 10;
        int priceInterval = rand.nextInt(10 - 5) + 5;
        int priceMax = priceMin+priceInterval;
        int neededMaterials = 10;
        //for now not used. it's probably not gonna be random int (neededMaterials) but a
        //table with information about each drink (for example beer: neededMaterials: 10)
        //While price is depending on customer so bartering and random number etc.

        System.out.println("price is:" + priceMin + "-" + priceMax);
        System.out.println("required materials:" + neededMaterials);

    }
}
