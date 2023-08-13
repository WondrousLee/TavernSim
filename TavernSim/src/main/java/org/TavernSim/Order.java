package org.TavernSim;
import java.util.*;

public class Order {
    int neededMaterials;


    String orderName = "Beer"; //static for now
    String name = "Bob";
    String MessageHi = "Hi! My names is ";
    String MessageGetMe = ", can you get me: ";
    String MessageBargainFailed = "Sorry no can do."; //delete it later

    //Bargain Related Dialogs, later there will be more variations etc.
    String ClientBargainTooExpensive = "I will not pay that amount of money for this drink! This price is outrageous!"; //0
    String ClientBargainClose = "Can you give me lower price?"; //1
    String ClientBargainCloser = "This price is almost ideal, can you lower it a little bit more tho?" ; //2
    String ClientTooLowPrice = "I can't give you so little for that drink!"; //3
    String MessageBargainEndOnFail = "I can't deal with you!";
    String MessageBargainSucceeded = "Yeah, it seems fair. There you go.";



    Random rand = new Random();
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?

    public void orderPlaced(){
        System.out.println("YOU: What can i get you?");
        System.out.println(name + ":" + MessageHi + name + MessageGetMe + orderName);

        int priceMin = rand.nextInt(20 - 10) + 10;
        int priceInterval = rand.nextInt(10 - 5) + 5;
        int priceMax = priceMin+priceInterval;
        int neededMaterials = 10;
        //for now not used. it's probably not gonna be random int (neededMaterials) but a
        //table with information about each drink (for example beer: neededMaterials: 10)
        //While price is depending on customer so bartering and random number etc.

        System.out.println("price is:" + priceMin + "-" + priceMax);
        System.out.println("required materials:" + neededMaterials);

        Scanner userInput = new Scanner(System.in);
        int bargainAttempts = 0;
        boolean finishBargain;
        do { //Get this into other method, tip by Zaszczynski, should prevent leaks and make code a lil cleaner
            int playerProposal = Integer.parseInt(userInput.nextLine());

            if (playerProposal >= priceMin && playerProposal <= priceMax) {
                System.out.println(MessageBargainSucceeded);
                finishBargain = true;
            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    System.out.println("-=| Bargain Failed! |=-"); //After changing status from "lower" to for example "just little bit lower" reset fail count
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
