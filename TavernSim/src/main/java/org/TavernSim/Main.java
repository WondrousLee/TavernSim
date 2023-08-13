package org.TavernSim;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------- Hello and welcome to Tavern! -------------------");
            Scanner userInputUi = new Scanner(System.in);
            boolean endgame = false;
            
            do {
                System.out.println("Tavern Player UI:");
                System.out.println("1: Get new customer in line");
                System.out.println("2: Close tavern");
                int MenuSelector = Integer.parseInt(userInputUi.nextLine());
                switch (MenuSelector) {
                    case 1 -> {
                        Order newOrder = new Order();
                        newOrder.orderPlaced();
                    }
                    case 2 -> {
                        System.out.println("Day 1 finished");
                        endgame = true;
                    }

                }
        } while(!endgame);
    }
}