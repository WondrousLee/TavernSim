package org.TavernSim;
import java.util.*;

import org.TavernSim.UiManagement.Displayable;

public class DialogSet extends Displayable {
    private String[] dialogLines;
    private Random random;

    //Constructor to initialize the dialog set with given lines
    public DialogSet(String... lines) {
        super(lines);
        dialogLines = lines; //Store provided dialog lines
        random = new Random(); //Random number generator
    }
    public Displayable getRandomDialog() {
        int randomIndex = random.nextInt(dialogLines.length);
        return new Displayable(dialogLines[randomIndex]); //Return Random Line
    }
}
