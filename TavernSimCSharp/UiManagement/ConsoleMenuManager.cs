
//Virtual Terminal Sequences!

using TavernSimCSharp.UiManagement;
using TavernSimCSharp.UiManagement.ControlManager;

public class ConsoleMenuManager : IMenuManager
{
    private GameState _gameState = GameState.Instance();
    public ConsoleMenuManager(string[] menuPrompts)
    {
        ConsoleControl keyInfo = new ConsoleControl();
        int selectIndex = 1;
        while (_gameState != null)
        {
            DisplayMenu(selectIndex, menuPrompts);
            switch (keyInfo.GetKey())
            {
                //Math max so that index will not go through max or min value.
                case ConsoleKey.UpArrow:
                    selectIndex = Math.Max(selectIndex - 1, 0);
                    break;
                case ConsoleKey.DownArrow:
                    selectIndex = Math.Min(selectIndex + 1, menuPrompts.Length - 1);
                    break;
                case ConsoleKey.Enter:
                    Console.WriteLine("Entered");
                    //Method to enter menu from index 
                    break;
            }
        }
    }

    //Display all prompts (and highlight menu)
    static void DisplayMenu(int selectIndex, String[] menuPrompts)
    {
        for (int i = 0; i < menuPrompts.Length; i++)
        {
            int currentRow = i;
            Console.SetCursorPosition(0, currentRow);

            if (i == selectIndex)
            {
                Console.Write("\u001b[7m"); //Reverse video for highlight effect
            }
            Console.WriteLine(menuPrompts[i]);
            Console.Write("\u001b[0m"); //Reset reverse video after printing!
        }
    }
}