package org.TavernSim;

import org.TavernSim.UiManagement.ConsoleUiManager;
import org.TavernSim.UiManagement.UiManagement;

public final class GameState {

    private static GameState INSTANCE;
    public UiManagement uiManager = new ConsoleUiManager();
    
    private GameState() { }
    
    public static GameState Instance() {
        if(INSTANCE == null) {
            INSTANCE = new GameState();
        }        
        return INSTANCE;
    }

    public void Dispose() {
        INSTANCE = null;
        uiManager.Dispose();
    }
}