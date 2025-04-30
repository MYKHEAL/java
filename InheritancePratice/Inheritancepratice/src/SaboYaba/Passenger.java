package SaboYaba;

public class Passenger extends Person{
private String destination;
private int money;
public Passenger(String name, String destination, int money ) {
    super(name);
    this.destination = destination;
    this.money = money;
}

public boolean payFare(int price) {
    if (money >= price) {
        money -= price;
        return true;
    }
    return false;
}

    public String getDestination() {
        return destination;
    }

    public int getMoney() {
        return money;
    }
}



