using namespace std;
#include <vector>
#include <string>
#include <sstream>
#include <DialogSet.h>
class Dialogs
{
private:
public:
    Displayable mainMenu(vector<string> mainMenu = {
        "[1]. Get new customer.",
        "[2]. Close tavern for the day.",
        "[3]. Close the game."
    });   
};