package org.TavernSim;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//Make player/tavern class with money etc. etc.
        System.out.println("------------------- Hello and welcome to Tavern! -------------------");
            Scanner userInputUi = new Scanner(System.in);
            boolean endgame = false;
            int openDay = 0; //later this will scale other things.
            do {
                System.out.println("Tavern Player UI:");
                System.out.println("1: Get new customer in line");
                System.out.println("2: Close tavern for the day");
                System.out.println("3: End game");
                int MenuSelector = Integer.parseInt(userInputUi.nextLine());
                switch (MenuSelector) {
                    case 1 -> {
                        Order newOrder = new Order();
                        newOrder.orderPlaced();
                    }
                    case 2 -> {
                        openDay++;
                        System.out.println("Day " + openDay + " finished");
                    }
                    case 3 -> {
                        endgame = true;
                    }

                }
        } while(!endgame);
    }
}