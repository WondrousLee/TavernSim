package org.TavernSim;
import java.util.*;
public class Client {

    //Messages, for now they are static. Later there will be multiple different messages
    String name = "Bob";
    String MessageHi = "Hi! My names is ";
    String MessageGetMe = ", can you get me: ";
    String MessageBargainSucceeded = "I can deal with that.";
    String MessageBargainFailed = "Sorry no can do.";
    int clientInterval = 20;

    void ClientComes() {
        System.out.println("YOU: What can i get you?");
        Order newOrder = new Order();
        newOrder.orderPlaced();
        System.out.println(name + ":" + MessageHi + name + MessageGetMe + newOrder.orderName);
    }
    
    public void Bargain() {
        Scanner userInput = new Scanner(System.in);

        int bargainAttempts = 0;
        boolean finishBargain = true;
        do { //Get this into other function tip by Zaszczynski, should prevent leaks? help?
            int playerProposal = Integer.parseInt(userInput.nextLine());

            if (playerProposal >= clientInterval) {
                System.out.println(MessageBargainSucceeded);
                finishBargain = true;
            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    System.out.println("-=| Bargain Failed! |=-");
                    System.out.println("I can't deal with you!");
                    break;
                }
                else{
                    System.out.println(MessageBargainFailed);
                }
            }
        }
        while(!finishBargain);
    }
}
