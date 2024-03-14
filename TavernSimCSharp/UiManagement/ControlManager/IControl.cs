namespace TavernSimCSharp.UiManagement.ControlManager;

public interface IControl<key>
//Things to note: You can check the type of object using "is"
//And this what i used are Generics.
//Generics can be used to work with different types without
//needing separate interfaces or classes, that's nuts!

//This is not exactly needed now, i downscaled whole project
//To terminal only, I will then start new project on Unity 
//Left this for learning purpose only
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