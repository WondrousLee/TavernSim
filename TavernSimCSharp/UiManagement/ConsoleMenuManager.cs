
//Virtual Terminal Sequences!

//Will work on it more later

using TavernSimCSharp.UiManagement;

public class ConsoleMenuManager : MenuManager
{
    private GameState _gameState = GameState.Instance();
    public ConsoleMenuManager(string[] menuPrompts)
    {
        int selectIndex = 0;
        while (_gameState != null)
        {
            ClearLine(selectIndex, menuPrompts);
            DisplayMenu(selectIndex, menuPrompts);
        }
    }
    //Okay, i know what i should rework here now:
    //I should probably take InfoKey and make full interface for it
    //It should me ControlManager and then ConsoleControlManager
    
    //Menu Management stuff should still be here i think
// const int indexOfFirstButton = 3;
//     public ConsoleMenuManager()
//     {
//         int selectIndex = 0;
//         bool endgame = false;
//
//         String[] menuPrompts = Dialogs.mainMenu.menuSelection.Array();
//         
//         while (!endgame)
//         {
//             ClearLine(selectIndex, menuPrompts);
//             DisplayMenu(selectIndex, menuPrompts);
//
//             ConsoleKeyInfo keyInfo = Console.ReadKey(true);
//             //Oddzielna metoda ktora sprawdza jaki jest typ Key
//             //Use run without debug for this to work!
//
//             switch (keyInfo.Key)
//             {
//                 //Math max so that index will not go through max or min value.
//                 case ConsoleKey.UpArrow:
//                     selectIndex = Math.Max(selectIndex - 1, 0);
//                     break;
//                 
//                 case ConsoleKey.DownArrow:
//                     selectIndex = Math.Min(selectIndex + 1, menuPrompts.Length - 1); //prolly need offset later.
//                     break;
//
//                 case ConsoleKey.Enter:
//                     //logic for selected menu
//                     Console.WriteLine(menuPrompts[selectIndex]);
//
//                     if (selectIndex == 0){
//                         Console.WriteLine("option 1");
//                     }
//                     else if (selectIndex == 1){
//                         Console.WriteLine("option 2");
//                     }
//                     else if (selectIndex == 2){
//                         endgame = true;
//                     }
//
//                     break;
//             }
//         }
//     }


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
    
    //Clear the line!
    static void ClearLine(int selectIndex, string[] menuPrompts)
    {
        Console.SetCursorPosition(0,   selectIndex);
        Console.Write(new String(' ', menuPrompts[selectIndex].Length));
    }
}