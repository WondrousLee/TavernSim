package org.TavernSim.UiManagement;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.TavernSim.GameState;

public class Displayable {
    public String message;
    private GameState gameState = GameState.Instance();

    public Displayable(String... lines) {
        this.message = Arrays.stream(lines).collect(Collectors.joining("\n"));
    }

    public void Display() {
        gameState.uiManager.DisplayMessage(message);
    }
}
