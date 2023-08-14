package org.TavernSim;

public class Tavern {
    public static int dublons = 0; //money

    public boolean hasProduct(String name) {
        return true;
    }

    public void sell(int amount) {
        dublons += amount;
    }
}
