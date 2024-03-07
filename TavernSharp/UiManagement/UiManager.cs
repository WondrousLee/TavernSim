public interface UiManager {
    public void DisplayMessage(String message);
    public void DisplayMessage(String[] message);
    public String getRawInput();
    public int GetIntInput();
}