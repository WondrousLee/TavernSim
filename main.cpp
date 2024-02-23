#include <iostream>
#include <vector>
#include <string>
#include <cmath>

// Rewrote whole "game" to C++.
// This way will be easier to integrate it to
// Bigger engine if i ever wanted to do this.
// Also i somewhat got what Dellson tried to add with
// Whole Ui model and gamestate.

//Spent 8 hours on that, cannot make it work, deleted almost all files, trying again.

#include <iostream>
#include <vector>
#include <string>
#include "GameState.cpp" // Adjust the include path according to your project structure

class Dialogs {
public:
    std::vector<std::string> mainMenu = {
        "Tavern Action Menu!",
        "1: Get new customer from the line",
        "2. Close tavern for the day",
        "3. Close the game"
    };
};

int main() {
    ConsoleUiManager uiManager;
    Dialogs dialogs;

    // Display the main menu
    uiManager.DisplayMessage(dialogs.mainMenu);

    // Placeholder for menu selection handling
    int choice = uiManager.GetIntInput();
    switch (choice) {
        case 1:
            std::cout << "Getting new customer..." << std::endl;
            // Implement the logic for getting a new customer
            break;
        case 2:
            std::cout << "Closing tavern for the day..." << std::endl;
            // Implement the logic for closing the tavern
            break;
        case 3:
            std::cout << "Closing the game. Goodbye!" << std::endl;
            // Implement game closure logic
            return 0; // Exit the program
        default:
            std::cout << "Invalid selection. Please try again." << std::endl;
            break;
    }

    // You might want to loop back to the menu until the game is closed
    // This is a simple linear example and does not loop

    return 0;
}
