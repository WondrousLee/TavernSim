package org.TavernSim;
import java.util.*;

public class Order {
    int neededMaterials;


    //This does not update the lines, it's kinda static. Fix for later (except for names and order)
    String orderName = "Beer"; //static for now, later this will be table of information with neededMaterials and orderName etc.
    DialogSet name = new DialogSet(
            "Bob",
            "Mikkeys",
            "Zerg",
            "Del-son",
            "Deckard",
            "Manuel",
            "Pepers",
            "hiky"
    );
    DialogSet MessageHi = new DialogSet(
            "Hello there! My name is ",
            "Hey, how's it going? My name is ",
            "Welcome! my name is "
    );
    DialogSet MessageGetMe = new DialogSet(
            " can you get me: ",
            " i want a: ",
            " will you get me: "
    );

    //Bargain Related Dialogs
    DialogSet ClientBargainTooExpensive = new DialogSet( //0
            " This price is outrageous! ",
            " No way! This price is too much even for nobles! ",
            " Huuh? Are you delusional? "
    );
    DialogSet ClientBargainClose = new DialogSet( //1
            " I can't pay that much, can you lower the price? ",
            " No way, can you lower the price? ",
            " This may not be the price i'm willing to pay, can you lower it? "
    );
    DialogSet ClientBargainCloser = new DialogSet( //2
            " Almost ideal price, can you lower it a little bit? ",
            " I'm almost willing to pay, but can you go lower? ",
            " This is close to what i'm willing to pay. "
    );
    String ClientTooLowPrice = "*You think to yourself that this price is too low. You won't profit at all!*"; //3
    DialogSet MessageBargainEndOnFail = new DialogSet(
            " I'm giving this pub a one star on magician network! ",
            " Fuck you, i'm not coming back! ",
            " Haah, this bar is ran by scammers "
    );
    DialogSet MessageBargainSucceeded = new DialogSet(
            " Thank you very much! ",
            " Yeah, this seems fair. There you go! ",
            " Sure, i'm willing to pay for that, there you go. "
    );



    Random rand = new Random();
    //if we consider that probably not every drink needs as much resources
    //the upperbound will scale down on the resource number?

    public void orderPlaced(){
        System.out.println("YOU: What can i get you?");
        System.out.println(name.getRandomDialog() + ":" + MessageHi.getRandomDialog() + name.getRandomDialog() + MessageGetMe.getRandomDialog() + orderName);

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

        //for resetting fail counter every time that user gets closer to intended price
        int statusNow = 0;
        int lastStatus = 0;

        do { //Get this into other method, tip by Zaszczynski, should prevent leaks and make code a lil cleaner
            int playerProposal = Integer.parseInt(userInput.nextLine());

            if (playerProposal >= priceMin && playerProposal <= priceMax) {
                System.out.println(MessageBargainSucceeded);
                finishBargain = true;
            } else {
                finishBargain = false;
                bargainAttempts++;

                if (bargainAttempts > 3){
                    System.out.println("-~= Bargain Failed! =~-");
                    System.out.println(MessageBargainEndOnFail);
                    break;
                }
                else {
                    if (!(statusNow == lastStatus)){
                        lastStatus = statusNow;
                        bargainAttempts = 0;
                    }
                    if (playerProposal >= priceMax+10) {
                        System.out.println(ClientBargainTooExpensive.getRandomDialog());
                        statusNow = 0;
                    }
                    if (playerProposal > priceMax+5 && playerProposal < priceMax+10){
                        System.out.println(ClientBargainClose.getRandomDialog());
                        statusNow = 1;
                    }
                    if (playerProposal > priceMax && playerProposal <= priceMax + 5) {
                        System.out.println(ClientBargainCloser.getRandomDialog());
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

        //return finishedTrade //boolean to finish trade roll for event and begin another bargain.
    }
}
