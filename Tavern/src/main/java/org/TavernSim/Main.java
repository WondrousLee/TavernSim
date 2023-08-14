package org.TavernSim;
import org.TavernSim.UiManagement.ConsoleUiManager;
import org.TavernSim.UiManagement.UiManagement;

public class Main {
    public static void main(String[] args) {
        UiManagement uiManager = new ConsoleUiManager();
        Tavern tavern = new Tavern();
        Client client = new Client();
        
        uiManager.DisplayMessage(Dialogs.MainMenu.WelcomeMessage);
        boolean endgame = false;
        int openDay = 0; //later this will scale other things.

        do {
            uiManager.DisplayMessage(Dialogs.MainMenu.MenuSelection);
            switch (uiManager.GetIntInput()) {
                case 1 -> {
                    Order newOrder = new Order(tavern, client, uiManager);
                    newOrder.orderPlaced();
                    newOrder.finalizeOrder();
                }
                case 2 -> {
                    openDay++;
                    uiManager.DisplayMessage(Dialogs.MainMenu.DayClock(openDay));
                }
                case 3 -> {
                    endgame = true;
                }

            }
        } while(!endgame);

        uiManager.Dispose();
    }
}