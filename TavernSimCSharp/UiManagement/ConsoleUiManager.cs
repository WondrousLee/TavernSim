public class ConsoleUiManager : UiManager
{
    public ConsoleUiManager () {}
    public void DisplayMessage(String message){
        Console.WriteLine(message);
    }
    public void DisplayMessage(String[] messages){
        foreach (String message in messages){
            DisplayMessage(message);
        }
    }
    public String GetRawInput(){
        return Convert.ToString(Console.ReadLine()); 
    }
    public int GetIntInput() {
        return Convert.ToInt32(Console.ReadLine());
    }
}