
//Virtual Terminal Sequences!

//Will work on it more later

public class ConsoleMenuManager
{

const int indexOfFirstButton = 3;
    public ConsoleMenuManager()
    {
        int selectIndex = 0;
        bool endgame = false;

        String[] menuPrompts = Dialogs.mainMenu.menuSelection.Array();
        
        while (!endgame)
        {
            ClearLine(selectIndex, menuPrompts);
            DisplayMenu(selectIndex, menuPrompts);

            ConsoleKeyInfo keyInfo = Console.ReadKey(true);
            //Use run without debug for this to work!

            switch (keyInfo.Key)
            {
                //Math max so that index will not go through max or min value.
                case ConsoleKey.UpArrow:
                    selectIndex = Math.Max(selectIndex - 1, 0);
                    break;

                case ConsoleKey.DownArrow:
                    selectIndex = Math.Min(selectIndex + 1, menuPrompts.Length - 1); //prolly need offset later.
                    break;

                case ConsoleKey.Enter:
                    //logic for selected menu
                    Console.WriteLine(menuPrompts[selectIndex]);

                    if (selectIndex == 0){
                        Console.WriteLine("option 1");
                    }
                    else if (selectIndex == 1){
                        Console.WriteLine("option 2");
                    }
                    else if (selectIndex == 2){
                        endgame = true;
                    }
                    break;
            }
        }
    }



    static void DisplayMenu(int selectIndex, String[] menuPrompts)
    {
        for (int i = 0; i < menuPrompts.Length; i++)
        {
            int currentRow = indexOfFirstButton + i;
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
        Console.SetCursorPosition(0, indexOfFirstButton + selectIndex);
        Console.Write(new String(' ', menuPrompts[selectIndex].Length));
    }
}