using System.Text;
using System.IO;
using Microsoft.VisualBasic;

public class Displayable
{
    //public String Message;
    private StringBuilder resultStrings = new StringBuilder();

    private string[] lines;
    private GameState gameState = GameState.Instance();

    
    public Displayable(String line)
    {
        lines = [line];
        resultStrings.AppendLine(line);
    }

    public Displayable(String[] lines)
    {
        this.lines = lines;
        foreach (String stringInLines in lines)
            resultStrings.AppendLine(stringInLines);
    }
    public void Display()
    {
        //That is intresting stuff, using makes StringReader disposed after
        //all code in braces is finished! Damn!
        using (var reader = new StringReader(resultStrings.ToString()))
        {
            gameState.gsUiManager.DisplayMessage(reader.ReadToEnd());
        }
    }
    public string[] Array(){
        return lines;
    }
}