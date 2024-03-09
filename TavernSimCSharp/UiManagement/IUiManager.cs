public interface IUiManager {
    public void DisplayMessage(String message);
    public void DisplayMessage(String[] message);
    public String GetRawInput();
    public int GetIntInput();
}