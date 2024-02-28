#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <sstream>
#include "./Displayable.h"

GameState& gameState = GameState::Instance(); //1
//I need to get rid of it, looks ugly, is there better way to do that?

    Displayable::Displayable(std::vector<std::string> &messages)
    {
        for (std::string message : messages)
        {
            ss << message;
        }
        finalMessage = ss.str();
    }
    Displayable::Displayable(std::string inputMessage)
    {
        finalMessage = inputMessage;
    }
    void Displayable::Display()
    {
        gameState.uiPointer->DisplayMessage(finalMessage); //This may also not work because of //1
    }   