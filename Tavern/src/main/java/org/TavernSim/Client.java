package org.TavernSim;

public class Client {
    int happiness = 50;
    int personalDublons = 100;

    public boolean canAfford(int amount) {
        return personalDublons >= amount;
    }

    public void spendMoney(int amount){
        personalDublons -= amount;
        happiness += amount;
    }
}
