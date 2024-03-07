using System.ComponentModel;

public sealed class GameState
//sealed == read only, prevents other classes from inheriting from it.
// So other classes wont create their own instance
{
    private static GameState INSTANCE;
    private GameState() {}

    //UiManager = new ConsoleUiManager();
    public UiManager gsUiManager = new ConsoleUiManager();
    public static GameState Instance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new GameState();
            Console.WriteLine("Game Initialized!");
        }
        return INSTANCE;
    }

    public void Destroy(){
        INSTANCE = null;
        //later dispose of other elements.
        //uiManager destroy
    }
}