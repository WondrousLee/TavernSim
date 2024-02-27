using namespace std;
#include <vector>
#include <string>
#include <sstream>
#include <cstdlib>
#include "DialogSet.h"

DialogSet::DialogSet(vector<string> &lines) : Displayable(lines)
{
    for (string line : lines)
    {
        dialogLines.push_back(line);
    }
}
Displayable DialogSet::getRandomDialog()
{
    randomIndex = rand() % dialogLines.size();
    return Displayable(dialogLines[randomIndex]);
}