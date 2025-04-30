package SaboYaba;

public class Driver extends Person{
    private String license;

    public Driver(String name, String license){
        super(name);
        this.license = license;

    }
    public String driveBus(Korope bus){
        if(bus.isFull()){
            return getName() + ": Bus moving from mushine to Sabo Yaba";

        }
        return getName() + ": Bus is not full, can't move";

    }
}
