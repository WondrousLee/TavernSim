
#include <vector>
#include <string>
#include <sstream>
#include <cstdlib>
#include "./DialogSet.h"

//This fails build, dunno why.
//It tells me there is a redefinition of "DialogSet"
//WHERE WHERE THE FUCK IS REDEFINITION YOU PEACE OF...
//Time wasted: 15 hours. (I'm not joking)

DialogSet::DialogSet(std::vector<std::string> &lines) : Displayable(lines)
{
    for (std::string line : lines)
    {
        dialogLines.push_back(line);
    }
}
Displayable DialogSet::getRandomDialog()
{
    randomIndex = rand() % dialogLines.size();
    return Displayable(dialogLines[randomIndex]);
}