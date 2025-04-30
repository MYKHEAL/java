package Turtle;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class TurtleTest {

//    @BeforeEach
//    public void setUp() {
//        Turtle turtle = new Turtle();
//    }

    @Test
    public void testPenIsUp(){
        Turtle turtle = new Turtle();
        turtle.penUp();
        assertTrue(turtle.getPen());
       // assertFalse(turtle.getPenDown());

    }

    @Test
    public void testIsPenDown(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        assertFalse(turtle.getPen());
    }

    @Test
    public void changeDirection(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
            assertEquals("SOUTH", turtle.getDirection());
//        turtle.turnRight();
//        assertEquals("SOUTH", turtle.getDirection());
    }



}
