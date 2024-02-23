#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <sstream>
using namespace std;

#include "../GameState.cpp"

class Displayable{
    public:
        string message;
        stringstream ss;

        Displayable(vector<string> &messages){
            for (string message : messages){
                ss << message;
            }
        }

        void Display() {
            gameState.uiPointer -> DisplayMessage(message);
        }


    private:
        GameState gameState;
 };