package org.TavernSim;
import java.util.*;
public class Client {

    //Messages, for now they are static. Later there will be multiple different messages
    String name = "Bob";
    String MessageHi = "Hi! My names is ";
    String MessageGetMe = ", can you get me: ";
    String MessageBargainSucceeded = "I can deal with that.";
    String MessageBargainFailed = "Sorry no can do.";
    String MessageBargainEndOnFail = "I can't deal with you!";

    int ClientComes() {
        System.out.println("YOU: What can i get you?");
        Order newOrder = new Order();
        newOrder.orderPlaced();
        System.out.println(name + ":" + MessageHi + name + MessageGetMe + newOrder.orderName);

        return newOrder.priceMin; //nah
        
    }

    
    public void Bargain() {
        Scanner userInput = new Scanner(System.in);

        int bargainAttempts = 0;
        boolean finishBargain;
        do { //Get this into other function tip by Zaszczynski, should prevent leaks?
            int playerProposal = Integer.parseInt(userInput.nextLine());

            if (playerProposal >= Order.priceMin || playerProposal <= Order.priceMax) { //ask someone how to access priceMin or priceMax from Order
                System.out.println(MessageBargainSucceeded);
                finishBargain = true;
            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    System.out.println("-=| Bargain Failed! |=-");
                    System.out.println(MessageBargainEndOnFail);
                    break;
                }
                else {
                    System.out.println(MessageBargainFailed); //this should later print out if we want lower value or higher.
                }
            }
        }
        while(!finishBargain);
    }
}
