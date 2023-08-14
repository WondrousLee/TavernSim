package org.TavernSim.UiManagement;

public interface UiManagement {
    public void DisplayMessage(String message);
    public void DisplayMessage(String[] message);
    public String GetRawInput();
    public Integer GetIntInput();
    public void Dispose();
}
