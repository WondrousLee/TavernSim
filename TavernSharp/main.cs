// See https://aka.ms/new-console-template for more information
using System.Security.AccessControl;


//Shouldn't be there a class Main? Need to check it later.

GameState gameState = GameState.Instance();
bool endgame = false;

do
{
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
            break;

    }


}
while (!endgame);