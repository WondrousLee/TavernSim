
public class Tavern {
    public int money = 0;

    public bool HasProduct(String productName){
        return true; //for now.
    }

    public void Sell(int amount){
        money += amount;
    }
}