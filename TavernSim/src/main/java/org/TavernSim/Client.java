package org.TavernSim;
import java.util.*;
public class Client {

    //Messages, for now they are static. Later there will be multiple different messages
    String name = "Bob";
    String MessageHi = "Hi! My names is ";
    String MessageGetMe = ", can you get me: ";


    void ClientComes(){
        System.out.println("YOU: What can i get you?");
        Order newOrder = new Order();
        newOrder.orderPlaced();
        System.out.println(name + ":" + MessageHi + name + MessageGetMe + newOrder.orderName);
    }
}
