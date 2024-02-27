#ifndef DIALOGSET_H
#define DIALOGSET_H

#include <memory>
#include <iostream>
#include <vector>
#include <string>
#include <cmath>

#include <Displayable.h>

class DialogSet : public Displayable
{
    private:
        int randomIndex;
        std::vector<std::string> dialogLines; //learn about this!
        int random;
        
    public: 
        DialogSet(std::vector<std::string> &lines) : Displayable(lines) {};
        Displayable getRandomDialog();
};


#endif