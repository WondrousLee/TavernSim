#include <iostream>
#include <memory>

#include "./UiManagement/ConsoleUiManager.cpp"

class GameState {
public:
    std::unique_ptr<UiManager> uiPointer;

    // Private constructor
    GameState() : uiPointer(std::make_unique<ConsoleUiManager>()) {}
    GameState(const GameState&) = delete;
    GameState& operator=(const GameState&) = delete;

    // access the singleton instance
    static GameState& Instance() {
        static GameState INSTANCE;
        return INSTANCE;
    }
};
