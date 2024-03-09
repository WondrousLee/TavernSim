
public sealed class GameState
//sealed == read only, prevents other classes from inheriting from it.
// So other classes wont create their own instance
//Basically Singleton?
{
    private static GameState INSTANCE;
    private GameState() {}
    
    public UiManager gsUiManager = new ConsoleUiManager();
    public static GameState Instance()
    {
        if (INSTANCE == null)
        {
            Console.Clear(); //Clear Terminal from trash at the beginning of the game.
            //Thie probably should not be here if i want this project
            //to be easy to port to engine.
            INSTANCE = new GameState();
        }
        return INSTANCE;
    }

    public void Destroy(){
        INSTANCE = null;
        //later dispose of other elements.
        //uiManager destroy
    }
}