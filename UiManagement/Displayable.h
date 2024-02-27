
#ifndef DISPLAYABLE_H
#define DISPLAYABLE_H

#include <memory>
#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <GameState.h>

class Displayable
{
private:
    std::string message; //check if stringstream is even needed
    std::stringstream ss;
    std::string finalMessage;

public:
    Displayable(std::vector<std::string> &messages);
    Displayable(std::string inputMessage);
    void Display();

private:
    GameState gameState;
};

#endif