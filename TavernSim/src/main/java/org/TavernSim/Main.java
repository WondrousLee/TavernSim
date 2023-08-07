package org.TavernSim;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("YOU: Hello and welcome to Tavern!");
        Scanner userInput = new Scanner(System.in);
        String chooseOption = userInput.nextLine();


        if (chooseOption.equals("client")) {

            Client newClient = new Client();
            newClient.ClientComes();
            chooseOption = userInput.nextLine();
        }
        }
    }