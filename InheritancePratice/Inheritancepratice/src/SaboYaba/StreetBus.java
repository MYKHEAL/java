package SaboYaba;

import java.util.Scanner;

public class StreetBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Korope bus = new Korope("korope");
        Conductor conductor = new Conductor("Wale", 0);
        Driver driver = new Driver("Tunde", "ABC123");

        System.out.println("Welcome to Mushin-Sabo korope! Fare: ₦400. \nConductor:" + conductor.getName());

        while (!bus.isFull()) {
            System.out.println("\nCurrent seats: " + bus.getSeatCount() + "/5");
            System.out.println("1. Add Passenger \n 2. Alight Passenger \n 3. Exit");
            System.out.print("Choose action (1-3): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter 1, 2, or 3.");
                continue;
            }
            if(choice == 1) {
                System.out.println("Enter Name: ");
                String passengerName = scanner.nextLine();
                System.out.println("Enter Destination: (Sabo only): )");
                String passengerDestination = scanner.nextLine();
                System.out.println("Enter Money (₦): ");
                int passengerMoney;
                try{
                    passengerMoney = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Invalid Money amount");
                    continue;
                }

                Passenger passenger = new Passenger(passengerName, passengerDestination, passengerMoney);
                if (conductor.checkDestination(passenger)) {
                    System.out.println(conductor.getName() + ": " + passengerName + "'s destination is good.");
                    System.out.println(bus.boardPassenger(passenger, conductor));
                }
                else {
                    System.out.println(conductor.getName() + ": " + passengerName + ", wrong route! Only Sabo allowed.");
                }

            } else if (choice == 2) {
                if (bus.getSeatCount() == 0) {
                    System.out.println("No passengers on the bus to alight!");
                    continue;
                }
                System.out.print("Enter passenger name to alight: ");
                String passengerName = scanner.nextLine();
                Passenger passenger = new Passenger(passengerName, "Sabo", 0);
                System.out.println(bus.alightPassenger(passenger));
            } else if (choice == 3) {
                System.out.println("Exiting. Bus not full, no trip.");
                break;
            } else {
                System.out.println("Invalid choice, enter 1, 2, or 3.");
            }
        }

        if (bus.isFull()) {
            System.out.println("\n" + conductor.getName() + ": Bus full, tell " + driver.getName() + " to move!");
            System.out.println(driver.driveBus(bus));
        }

        System.out.println("Total fares collected by " + conductor.getName() + ": ₦" + conductor.getMoney());
        scanner.close();
    }
}


