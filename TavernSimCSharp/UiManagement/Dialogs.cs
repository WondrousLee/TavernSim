public class Dialogs
{
    GameState gameState = GameState.Instance();
    public class mainMenu
    {
        public static Displayable headerMenuSelection = new Displayable("\u001bTavern Player UI:\u001b");
        public static Displayable menuSelection = new Displayable(
        lines:
            [
                "1: Get new customer in line",
                "2: Close tavern for the day",
                "3: End game",
            ]);


    } //Add rest of the dialogues
}