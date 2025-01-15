public class Ac {
   public static Boolean power = false;
     private int control = 17;

    public void powerOn() {
        power = true;

    }

    public void powerOff() {
        power = false;
    }

    public boolean getPowerOn() {
        return power;
    }



    public int setControl(int temp) {
        if (temp < 16) {
            control = 16;
        } else if (temp > 30) {
            control = 30;
        } else {
            control = temp;
        }
        return control;
    }

    public int increaseTemp() {
        if (control < 30) {
            control++;
        }
        return control;
    }


    public int decreaseTemp() {
        if (control > 16) {
            control--;
        }
        return control;
    }
}