#ifndef UIMANAGER_H
#define UIMANAGER_H

#include <memory>
#include <iostream>
#include <vector>
#include <string>
#include <cmath>

class UiManager {
    public:
        virtual void DisplayMessage(std::string message) const = 0;
        virtual void DisplayMessage(std::vector<std::string> &message) const = 0;
        virtual std::string GetRawInput() const = 0;
        virtual int GetIntInput() const = 0;
        virtual ~UiManager() {}
};

//Basically you don't need any cpp file for interface like class
//because you don't do any actions on it.

#endif