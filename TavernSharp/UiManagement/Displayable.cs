using System.Text;
using System.IO;
using Microsoft.VisualBasic;

public class Displayable
{
    public String message;
    private StringBuilder resultStrings;
    private GameState gameState = GameState.Instance();

    public Displayable(String line = null, String[] lines = null)
    {

        StringBuilder resultStrings = new StringBuilder();

        if (line != null)
        {
            resultStrings.AppendLine(line);
        }
        else if (lines != null)
        {
            foreach (String stringInLines in lines)
            {
                resultStrings.AppendLine(stringInLines);
            }
        }
    }
    //Dunno if it's the best thing i could come up with but oh well...
    //Ill try to use it in home.

    public void Display()
    {
        //That is intresting stuff, using makes StringReader disposed after
        //all code in braces is finished! Damn!
        using (StringReader reader = new StringReader(resultStrings.ToString()))
        {
            gameState.gsUiManager.DisplayMessage(reader.ReadToEnd());
        }
    }


}