package org.TavernSim;

import org.TavernSim.UiManagement.ConsoleUiManager;
import org.TavernSim.UiManagement.UiManagement;

public class Dialogs {
    
    public class MainMenu {
        static String WelcomeMessage = "------------------- Hello and welcome to Tavern! -------------------";
        static String[] MenuSelection = {
            "Tavern Player UI:",
            "1: Get new customer in line",
            "2: Close tavern for the day",
            "3: End game"
        };

        static String DayClock(int dayNumber) {
            return "Day " + dayNumber + " finished";
        }
    }   

    public class OrderDialogs {
        static String ClientTooLowPrice = "*You think to yourself that this price is too low. You won't profit at all!*";
        static DialogSet Names = new DialogSet(
                "Bob",
                "Mikkeys",
                "Zerg",
                "Del-son",
                "Deckard",
                "Manuel",
                "Pepers",
                "hiky"
        );
        static DialogSet MessageHi = new DialogSet(
            "Hello there! My name is ",
            "Hey, how's it going? My name is ",
            "Welcome! my name is "
        );
        static DialogSet MessageGetMe = new DialogSet(
            " can you get me: ",
            " i want a: ",
            " will you get me: "
        );

        //Bargain Related Dialogs
        static DialogSet ClientBargainTooExpensive = new DialogSet( //0
            " This price is outrageous! ",
            " No way! This price is too much even for nobles! ",
            " Huuh? Are you delusional? "
        );
        static DialogSet ClientBargainClose = new DialogSet( //1
            " I can't pay that much, can you lower the price? ",
            " No way, can you lower the price? ",
            " This may not be the price i'm willing to pay, can you lower it? "
        );
        static DialogSet ClientBargainCloser = new DialogSet( //2
            " Almost ideal price, can you lower it a little bit? ",
            " I'm almost willing to pay, but can you go lower? ",
            " This is close to what i'm willing to pay. "
        );
        static DialogSet MessageBargainEndOnFail = new DialogSet(
            " I'm giving this pub a one star on magician network! ",
            " Fuck you, i'm not coming back! ",
            " Haah, this bar is ran by scammers "
        );
        static DialogSet MessageBargainSucceeded = new DialogSet(
            " Thank you very much! ",
            " Yeah, this seems fair. There you go! ",
            " Sure, i'm willing to pay for that, there you go. "
        );

        static String[] Introduction(String orderName) {
            return new String[] {
                "YOU: What can i get you?",
                Names.getRandomDialog() + ": " + MessageHi.getRandomDialog() + " " + Names.getRandomDialog() + " " + MessageGetMe.getRandomDialog() + " " + orderName
            };
        };
        
        static String[] PriceAndMaterials(int priceMin, int priceMax, int materialsRequired) {
            return new String[] {
                "price is:" + priceMin + "-" + priceMax,
                "required materials:" + materialsRequired
            };
        };

        static String[] BargainFailed = {
                "-~= Bargain Failed! =~-",
                MessageBargainEndOnFail.getRandomDialog()
        };
    }
}
