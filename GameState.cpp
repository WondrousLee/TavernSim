#include <iostream>
#include <memory>
#include <../GameState.h>
#include <./UiManagement/ConsoleUiManager.h>




    GameState::GameState() : uiPointer(std::make_unique<ConsoleUiManager>()) {}
    //Access the singleton instance.
    GameState& GameState::Instance() {
        static GameState INSTANCE;
        return INSTANCE;
    }