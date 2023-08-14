package org.TavernSim;
import java.util.*;

public class DialogSet {
    public Dictionary<String, String> dialogs = new Dictionary...;
    private String[] dialogLines;
    private Random random;

    //Constructor to initialize the dialog set with given lines
    public DialogSet(String... lines) {
        dialogLines = lines; //Store provided dialog lines
        random = new Random(); //Random number generator
    }
    public String getRandomDialog() {
        int randomIndex = random.nextInt(dialogLines.length);
        return dialogLines[randomIndex]; //Return Random Line
    }

    dialogs.Add("MessageHi", MessageHi);

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
}
