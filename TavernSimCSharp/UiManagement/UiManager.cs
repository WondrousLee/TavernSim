public interface UiManager {
    public void DisplayMessage(String message);
    public void DisplayMessage(String[] message);
    public String GetRawInput();
    public int GetIntInput();
    public void GetKeyboardInput();
    
}