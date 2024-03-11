

public class Client {
    int personalMoney = 100;

    public bool CanAfford(int amount){
        return personalMoney >= amount;
    }

    public void SpendMoney(int amount){
        personalMoney -= amount;
    }
}