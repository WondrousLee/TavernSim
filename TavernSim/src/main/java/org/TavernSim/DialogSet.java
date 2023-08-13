package org.TavernSim;
import java.util.*;

public class DialogSet {
    private String[] dialogLines;
    private Random random;

    public DialogSet(String... lines) {
        dialogLines = lines;
        random = new Random();
    }

    public String getRandomDialog() {
        int randomIndex = random.nextInt(dialogLines.length);
        return dialogLines[randomIndex];
    }

}
