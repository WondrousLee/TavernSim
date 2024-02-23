#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include "UiManager.cpp"

class ConsoleUiManager : public UiManager
{
public:
    void DisplayMessage(string message) const override
    {
        cout << message;
    }
    void DisplayMessage(vector<string> &messages) const override
    {
        for (string message : messages){
            cout << message << endl;
        }
    }

    string GetRawInput() const override {
        string userInput;
        cin >> userInput;
        return userInput;
    }
    
    int GetIntInput() const override {
        int userInput;
        cin >> userInput;
        return userInput;
        //changed it because it was easier that
        //way in the c++
    }

    ConsoleUiManager() {};
};