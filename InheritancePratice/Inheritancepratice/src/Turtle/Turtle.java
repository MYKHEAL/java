package Turtle;

public class Turtle {
    private boolean isPen = true;
    private Direction direction = Direction.EAST;

    public void penUp(){
        this.isPen = true;
    }
    public void penDown(){
        this.isPen = false;
    }

    public boolean getPen(){
        return isPen;
    }

    public String getDirection(){

        return direction.name();
    }


    public void turnRight() {
      //  if(direction == Direction.EAST) direction = Direction.SOUTH;
        if(direction == Direction.EAST) direction = Direction.SOUTH;

    }
}