//C++ does not have interfaces, what the hell.
//That's somewhat working like interface

#include <iostream>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

class UiManager {
    public:
        virtual void DisplayMessage(string message) const = 0;
        virtual void DisplayMessage(vector<string> &message) const = 0;
        virtual string GetRawInput() const = 0;
        virtual int GetIntInput() const = 0;
        virtual ~UiManager() {}
};

//needed to add that const = 0 to make it possible to modify