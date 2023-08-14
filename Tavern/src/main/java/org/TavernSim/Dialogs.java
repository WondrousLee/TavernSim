package org.TavernSim;

public class Dialogs {
    static DialogSet name = new DialogSet(
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
}