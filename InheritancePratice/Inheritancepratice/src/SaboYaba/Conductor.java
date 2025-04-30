package SaboYaba;

public class Conductor extends Person{
    private int fares;
    public Conductor(String name,int fares) {
        super(name);
        this.fares = fares;
    }
    public String collectMonry(Passenger passenger, int price) {
        int initialMoney = passenger.getMoney();
        if(passenger.payFare(price)){
            fares += price;

            int change = initialMoney - passenger.getMoney();
            String message = getName() + "collected ₦ " + price + "from " + passenger.getName() + " to " + passenger.getName();
            if (change > 0) {
                message += ", returned ₦" + change + "chnage";
            }else{
                message += ".";
            }
            return message;
        }
        return passenger.getName() + " can't pay fare";
    }

    public boolean checkDestination(Passenger passenger) {
        return passenger.getDestination().equalsIgnoreCase("Sabo");
    }

    public int getMoney() {
        return fares;
    }
}
