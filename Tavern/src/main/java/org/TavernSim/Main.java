package org.TavernSim;

public class Main {
    public static void main(String[] args) {
        GameState gameState = GameState.Instance();
        Tavern tavern = new Tavern();
        Client client = new Client();
        
        Dialogs.MainMenu.WelcomeMessage.Display();
        boolean endgame = false;
        int openDay = 0; //later this will scale other things.

        do {
            Dialogs.MainMenu.MenuSelection.Display();
            switch (gameState.uiManager.GetIntInput()) {
                case 1 -> {
                    Order newOrder = new Order(tavern, client);
                    newOrder.orderPlaced();
                    newOrder.finalizeOrder();
                }
                case 2 -> {
                    openDay++;
                    Dialogs.MainMenu.DayClock(openDay).Display();
                }
                case 3 -> {
                    endgame = true;
                }

            }
        } while(!endgame);

        gameState.Dispose();
    }
}