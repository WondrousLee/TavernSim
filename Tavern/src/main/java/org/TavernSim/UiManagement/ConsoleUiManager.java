package org.TavernSim.UiManagement;

import java.util.Scanner;

public class ConsoleUiManager implements UiManagement {
    Scanner userInput;

    public ConsoleUiManager() {
        userInput = new Scanner(System.in);
    }

    public void DisplayMessage(String message) {
        System.out.println(message);
    }

    public void DisplayMessage(String[] messages) {
        for (String message : messages) {
            DisplayMessage(message);
        }
    }

    public String GetRawInput() {
        return userInput.nextLine();
    }

    public Integer GetIntInput() {
        return Integer.parseInt(userInput.nextLine());
    }


    public void Dispose() {
        userInput.close();
    }
}
