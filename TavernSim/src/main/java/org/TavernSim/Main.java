package org.TavernSim;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Client newClient = new Client();
        System.out.println("------------------- Hello and welcome to Tavern! -------------------");
        newClient.ClientComes();
        newClient.Bargain();
    }
    }