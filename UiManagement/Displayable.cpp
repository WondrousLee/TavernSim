#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <sstream>
#include <Displayable.h>


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
        message = inputMessage;
    }
    void Displayable::Display()
    {
        Displayable::gameState.uiPointer->DisplayMessage(finalMessage);
    }