#include <iostream>
#include <memory>

#include "./UiManagement/ConsoleUiManager.cpp"
#include "./Dialogue/Dialogs.cpp"

class GameState {
public:
    std::unique_ptr<UiManager> uiPointer;
    GameState() : uiPointer(std::make_unique<ConsoleUiManager>()) {}
    //Basically what it does because it's quite hard:
    //Initializes GameState, then creates new ConsoleUiManager which 
    // is assigned to uiPointer
    //  this ensures that GameState has it's own ConsoleUiManager.

    GameState(const GameState&) = delete;
    //Deletes constuctor of GameState
    //There is only one unique GameState.

    GameState& operator=(const GameState&) = delete;
    //This ensures that GameState cannot be assigned to other obj

    //Access the singleton instance.
    static GameState& Instance() {
        static GameState INSTANCE;
        return INSTANCE;
    }
};
