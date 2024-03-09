namespace TavernSimCSharp.UiManagement.ControlManager;

public interface IControl<key>
//Things to note: You can check the type of object using "is"
//And this what i used are Generics.
//Generics can be used to work with differnet types without
//needing seperate interfaces or classes, that's nuts!
{
    void HandleInput();
    key GetKey();
}

public class ConsoleControl : IControl<ConsoleKey>
{
    private ConsoleKeyInfo KeyInfo;
    public void HandleInput()
    {
        ConsoleKeyInfo keyInfo = Console.ReadKey(true);
    }
    public ConsoleKey GetKey()
    {
        return KeyInfo.Key;
    }
}