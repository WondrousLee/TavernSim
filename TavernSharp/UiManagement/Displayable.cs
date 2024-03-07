using System.Text;
using Microsoft.VisualBasic;

public class Displayable
{
    public String message;
    private StringBuilder resultStrings;
    private GameState gameState = GameState.Instance();

    public Displayable(String[] lines = null)
    {
        StringBuilder resultStrings = new StringBuilder();
            foreach (String stringInLines in lines)
            {
                resultStrings.AppendLine(stringInLines);
            }
    }
    //Before there was 2 different constructors, but i changed it to one constructor
    //Because DialogSet was throwing an error: CS7036

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