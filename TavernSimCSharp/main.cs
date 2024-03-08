GameState gameState = GameState.Instance();
bool endgame = false;



Dialogs.mainMenu.welcomeMessage.Display();
do {
    Dialogs.mainMenu.menuSelection.Display();
    switch (gameState.gsUiManager.GetIntInput())
    {
        case 1: //Get new order.
            gameState.gsUiManager.DisplayMessage("Get new order!");
            break;

        case 2: //Close the tavern for the day.
            gameState.gsUiManager.DisplayMessage("Closing for the day!");
            break;

        case 3: //Close the game.
            endgame = true;
            gameState.gsUiManager.DisplayMessage("Thanks for game!");
            //Could save progress to txt file.
            break;
    }


}
while (!endgame);


//My thought is that i could probably change it a little bit.
//Add another class that could manage if player gets to choose option OR
//if there is a timer or event. Because right now everything that
//Will be happening is ofc only haggling
//Could use GameState for that, i'm not sure if it's a good idea tho.