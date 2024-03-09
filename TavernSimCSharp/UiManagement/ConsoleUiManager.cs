public class ConsoleUiManager : UiManager
{
    public ConsoleKeyInfo keyInfo; //No idea how to implement it.
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

    public void GetKeyboardInput() //This too, it's confusing
    {
        keyInfo = Console.ReadKey(true);
    }
}