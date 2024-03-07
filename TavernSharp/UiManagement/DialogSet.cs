


public class DialogSet : Displayable {
    private String[] dialogLines;
    private Random random;

    public DialogSet(String[] lines){
        dialogLines = lines;
        random = new Random();
    }

    public Displayable getRandomDialog() {
        int randomIndex = random.Next(dialogLines.Length);
        return new Displayable(dialogLines[randomIndex]);
        //This will not work correctly, issue is in Displayable types i guess?`
    }
}