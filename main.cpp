// Rewrote whole "game" to C++.
// This way will be easier to integrate it to
// Bigger engine if i ever wanted to do this.
// Also i somewhat got what Dellson tried to add with
// Whole Ui model and gamestate.

//Todo: .h files.
#include <iostream>
#include <vector>
#include <string>
#include "GameState.h"
using namespace std;

int main()
{


    //Not sure what is wrong, something with Instance?
    GameState& gameState = GameState::Instance();
    bool endgame = false;

    do
    {
        // dialogueAccess.mainMenu();
        switch (gameState.uiPointer->GetIntInput())
        {
        case 1:
            cout << "Getting new customer..." << std::endl;
            // Implement the logic for getting a new customer
            break;
        case 2:
            cout << "Closing tavern for the day..." << std::endl;
            // Implement the logic for closing the tavern
            break;
        case 3:
            cout << "Closing the game. Goodbye!" << std::endl;
            endgame = true;
            return 0;
        default:
            cout << "Invalid selection. Please try again." << std::endl;
            break;
        }
    } while (!endgame);
    // You might want to loop back to the menu until the game is closed

    return 0;
}
