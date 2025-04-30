package SaboYaba;

public class Korope extends Vehicle {
    private Passenger[] seats;
    private int seatCount;
    private final int price = 500;

    public Korope(String model) {
        super(model);
        this.seats = new Passenger[5];
        this.seatCount = 0;
    }

    public String boardPassenger(Passenger passenger, Conductor conductor) {
        if (seatCount < 5) {
            if (!conductor.checkDestination(passenger)) {
                return passenger.getName() + "Am not going there only sabo";
            }

            if (!passenger.payFare(price)) {
                return passenger.getName();
            }

            String fareResult = conductor.collectMonry(passenger, price);
            seats[seatCount] = passenger;
            seatCount++;

            return passenger.getName() + " boarded, available seats: " + getAvailableSeat() + "/5\n" + fareResult;
        }
        return passenger.getName() + ": Bus is full, no seats";
    }

    public String alightPassenger(Passenger passenger) {
        for(int counter = 0; counter < seatCount; counter++) {
            if(seats[counter] != null && seats[counter].getName().equals(passenger.getName())){
                seats[counter] = null;
                seatCount--;
                return passenger.getName() + ": alighted available seats" + getAvailableSeat() + "/5";
            }
        }
        return passenger.getName() + "not on bus";
    }
        public boolean isFull(){
        return seatCount == 5;
        }
        public int getSeatCount(){
        return seatCount;
        }

        public int getPrice(){
        return price;
        }
        public int getAvailableSeat(){
        return 5 - seatCount;
        }
}
