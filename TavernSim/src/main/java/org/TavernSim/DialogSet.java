package org.TavernSim;
import java.util.*;

public class DialogSet {
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

}
