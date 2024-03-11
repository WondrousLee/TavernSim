namespace TavernSimCSharp.UiManagement.ControlManager;

public interface IControl<key>
//Things to note: You can check the type of object using "is"
//And this what i used are Generics.
//Generics can be used to work with differnet types without
//needing seperate interfaces or classes, that's nuts!
{
    key GetKey();
}

public class ConsoleControl : IControl<ConsoleKey>
{
    public ConsoleKey GetKey()
    {
        return Console.ReadKey(true).Key;
    }
}