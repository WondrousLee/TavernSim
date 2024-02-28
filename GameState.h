#ifndef GAMESTATE_H
#define GAMESTATE_H
#include <memory>
#include "UiManagement/UiManager.h"
#include "./UiManagement/ConsoleUiManager.h"

class GameState
{
private:
    GameState();

public:
    std::unique_ptr<UiManager> uiPointer;
    GameState(const GameState &) = delete;
    // Deletes constuctor of GameState
    // There is only one unique GameState.
    GameState &operator=(const GameState &) = delete;
    static GameState &Instance();
};

#endif // GAMESTATE_H