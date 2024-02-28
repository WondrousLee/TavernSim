#ifndef CONSOLEUIMANAGER_H
#define CONSOLEUIMANAGER_H

#include <memory>
#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include "./UiManager.h"


class ConsoleUiManager : public UiManager
{
public:
    void DisplayMessage(std::string message) const override;
    void DisplayMessage(std::vector<std::string> &messages) const override;
    std::string GetRawInput() const override;
    int GetIntInput() const override;
    ConsoleUiManager();
};

#endif