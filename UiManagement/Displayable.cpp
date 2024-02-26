#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <sstream>
using namespace std;

#include "../GameState.cpp"

class Displayable
{
private:
    string message;
    stringstream ss;

public:
    Displayable(vector<string> &messages)
    {
        for (string message : messages)
        {
            ss << message;
        }
    }
    Displayable(string inputMessage)
    {
        message = inputMessage;
    }
    void Display()
    {
        gameState.uiPointer->DisplayMessage(message);
    }

private:
    GameState gameState;
};