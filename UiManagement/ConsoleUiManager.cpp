#include "./ConsoleUiManager.h"
#include <iostream>
#include <vector>
#include <string>
#include <cmath>

    void ConsoleUiManager::DisplayMessage(std::string message) const
    {
        std::cout << message;
    }
    void ConsoleUiManager::DisplayMessage(std::vector<std::string> &messages) const
    {
        for (std::string message : messages){
            std::cout << message << std::endl;
        }
    }

    std::string ConsoleUiManager::GetRawInput() const {
        std::string userInput;
        std::cin >> userInput;
        return userInput;
    }
    
    int ConsoleUiManager::GetIntInput() const {
        int userInput;
        std::cin >> userInput;
        return userInput;
        //changed it because it was easier that
        //way in the c++
    }

    ConsoleUiManager::ConsoleUiManager() {};