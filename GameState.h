#ifndef GAMESTATE_H
#define GAMESTATE_H
#include <./UiManagement/UiManager.h> 
#include <memory>

class UiManager; //Forward Declaration

class GameState
{
private:
    GameState();
    std::unique_ptr<UiManager> uiPointer;
public:
    GameState(const GameState &) = delete;
    // Deletes constuctor of GameState
    // There is only one unique GameState.
    GameState &operator=(const GameState &) = delete;
    static GameState& Instance();
};

#endif // GAMESTATE_H