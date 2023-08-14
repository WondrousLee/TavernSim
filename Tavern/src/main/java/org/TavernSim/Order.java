package org.TavernSim;
import java.util.Random;

import org.TavernSim.UiManagement.UiManagement;

public class Order {
    int neededMaterials;

    public int orderValue = 0;

    //This does not update the lines, it's kinda static. Fix for later (except for names and order)
    String orderName = "Beer"; //static for now, later this will be table of information with neededMaterials and orderName etc.
    Random rand = new Random();
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?

    private Tavern tavern;
    private Client client;
    private UiManagement uiManager;

    public Order(Tavern tavern, Client client, UiManagement uiManager) {
        this.tavern = tavern;
        this.client = client;
        this.uiManager = uiManager;
    }

    public void orderPlaced(){
        int priceMin = rand.nextInt(20 - 10) + 10;
        int priceInterval = rand.nextInt(10 - 5) + 5;
        int priceMax = priceMin+priceInterval;
        //it's probably not gonna be random int (neededMaterials) but a
        //table with information about each drink (for example beer: neededMaterials: 10)
        //While price is depending on customer so bartering and random number etc.

        uiManager.DisplayMessage(Dialogs.OrderDialogs.Introduction(orderName));
        uiManager.DisplayMessage(Dialogs.OrderDialogs.PriceAndMaterials(priceMin, priceMax, priceMax));

        int bargainAttempts = 0;
        boolean finishBargain;

        //for resetting fail counter every time that user gets closer to intended price
        int statusNow = 0;
        int lastStatus = 0;

        do { //Get this into other method, tip by Zaszczynski, should prevent leaks and make code a lil cleaner
            int playerProposal = uiManager.GetIntInput();

            if (playerProposal >= priceMin && playerProposal <= priceMax) {
                uiManager.DisplayMessage(Dialogs.OrderDialogs.MessageBargainSucceeded.getRandomDialog());
                orderValue = playerProposal;
                finishBargain = true;

            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    uiManager.DisplayMessage(Dialogs.OrderDialogs.BargainFailed);
                    break;
                }
                else {
                    if (!(statusNow == lastStatus)){
                        lastStatus = statusNow;
                        bargainAttempts = 0;
                    }
                    if (playerProposal >= priceMax+10) {
                        uiManager.DisplayMessage(Dialogs.OrderDialogs.MessageBargainSucceeded.getRandomDialog());
                        System.out.println(Dialogs.OrderDialogs.ClientBargainTooExpensive.getRandomDialog());
                        statusNow = 0;
                    }
                    if (playerProposal > priceMax+5 && playerProposal < priceMax+10){
                        uiManager.DisplayMessage(Dialogs.OrderDialogs.MessageBargainSucceeded.getRandomDialog());
                        System.out.println(Dialogs.OrderDialogs.ClientBargainClose.getRandomDialog());
                        statusNow = 1;
                    }
                    if (playerProposal > priceMax && playerProposal <= priceMax + 5) {
                        uiManager.DisplayMessage(Dialogs.OrderDialogs.MessageBargainSucceeded.getRandomDialog());
                        System.out.println(Dialogs.OrderDialogs.ClientBargainCloser.getRandomDialog());
                        statusNow = 2;
                    }
                    if (playerProposal < priceMin) {
                        uiManager.DisplayMessage(Dialogs.OrderDialogs.ClientTooLowPrice);
                        statusNow = 3;
                    }
                }
            }
        }
        while(!finishBargain);
    }

    public void finalizeOrder(){
        if (client.canAfford(orderValue) && tavern.hasProduct("Beer")) {
            client.spendMoney(orderValue);
            tavern.sell(orderValue);
        }
    }
}
