package org.TavernSim;
import java.util.Random;
import java.util.Scanner;

public class Order {
    int neededMaterials;

    public int orderValue = 0;

    //This does not update the lines, it's kinda static. Fix for later (except for names and order)
    String orderName = "Beer"; //static for now, later this will be table of information with neededMaterials and orderName etc.
    String ClientTooLowPrice = "*You think to yourself that this price is too low. You won't profit at all!*"; //3


    Random rand = new Random();
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?

    private Tavern tavern;
    private Client client;

    public Order(Tavern tavern, Client client) {
        this.tavern = tavern;
        this.client = client;
    }

    public void orderPlaced(){
        System.out.println("YOU: What can i get you?");
        System.out.println(Dialogs.name.getRandomDialog() + ":" + Dialogs.MessageHi.getRandomDialog() + Dialogs.name.getRandomDialog() + Dialogs.MessageGetMe.getRandomDialog() + orderName);
        int priceMin = rand.nextInt(20 - 10) + 10;
        int priceInterval = rand.nextInt(10 - 5) + 5;
        int priceMax = priceMin+priceInterval;
        //it's probably not gonna be random int (neededMaterials) but a
        //table with information about each drink (for example beer: neededMaterials: 10)
        //While price is depending on customer so bartering and random number etc.

        System.out.println("price is:" + priceMin + "-" + priceMax);
        System.out.println("required materials:" + neededMaterials);

        Scanner userInput = new Scanner(System.in);
        int bargainAttempts = 0;
        boolean finishBargain;

        //for resetting fail counter every time that user gets closer to intended price
        int statusNow = 0;
        int lastStatus = 0;

        do { //Get this into other method, tip by Zaszczynski, should prevent leaks and make code a lil cleaner
            int playerProposal = Integer.parseInt(userInput.nextLine());

            if (playerProposal >= priceMin && playerProposal <= priceMax) {
                System.out.println(Dialogs.MessageBargainSucceeded.getRandomDialog());
                orderValue = playerProposal;
                finishBargain = true;

            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    System.out.println("-~= Bargain Failed! =~-");
                    System.out.println(Dialogs.MessageBargainEndOnFail.getRandomDialog());
                    break;
                }
                else {
                    if (!(statusNow == lastStatus)){
                        lastStatus = statusNow;
                        bargainAttempts = 0;
                    }
                    if (playerProposal >= priceMax+10) {
                        System.out.println(Dialogs.ClientBargainTooExpensive.getRandomDialog());
                        statusNow = 0;
                    }
                    if (playerProposal > priceMax+5 && playerProposal < priceMax+10){
                        System.out.println(Dialogs.ClientBargainClose.getRandomDialog());
                        statusNow = 1;
                    }
                    if (playerProposal > priceMax && playerProposal <= priceMax + 5) {
                        System.out.println(Dialogs.ClientBargainCloser.getRandomDialog());
                        statusNow = 2;
                    }
                    if (playerProposal < priceMin) {
                        System.out.println(ClientTooLowPrice);
                        statusNow = 3;
                    }
                    //debug
//                    System.out.println("status now:" + statusNow);
//                    System.out.println("status before:" +lastStatus);
//                    System.out.println("bargain attempts:" +bargainAttempts);



                    //Yes I know that user can just jump between 2 statuses and reset how many times they want to
                    //this will be addressed in the future.
                    //probably with some type of reputation system?
                }
            }
        }
        while(!finishBargain);
        userInput.close(); //Destroying userInput prevents memory leaks
        //return finishedTrade //boolean to finish trade roll for event and begin another bargain.
    }

    public void finalizeOrder(){
        if (client.canAfford(orderValue) && tavern.hasProduct("Beer")) {
            client.spendMoney(orderValue);
            tavern.sell(orderValue);
        }
    }
}
