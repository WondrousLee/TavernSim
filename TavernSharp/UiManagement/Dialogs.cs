public class Dialogs
{
    GameState gameState = GameState.Instance();


    public class mainMenu
    {
        public static Displayable menuSelection = new Displayable(null,
        [
            "Tavern Player UI:",
            "1: Get new customer in line",
            "2: Close tavern for the day",
            "3: End game"
        ]);
    }
}