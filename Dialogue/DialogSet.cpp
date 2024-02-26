using namespace std;
#include <vector>
#include <string>
#include <sstream>
#include <./UiManagement/Displayable.cpp>

class DialogSet : public Displayable
{
    private:
        vector<string> dialogLines;
        int random;


    public: 
        DialogSet(vector<string> &lines) : Displayable(lines){
            for (string line : lines){
                dialogLines.push_back(line);
            }
        }
        Displayable getRandomDialog(){
            int randomIndex = rand() % dialogLines.size();
            return Displayable(dialogLines[randomIndex]);
        }
};