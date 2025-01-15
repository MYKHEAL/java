import org.junit.Test;

import static org.junit.Assert.*;

public class AcTest {
    Ac ac = new Ac();

    @Test
    public void acIsOn() {
        ac.powerOn();
        assertTrue(ac.getPowerOn());
    }

    @Test
    public void acIsOff() {
        ac.powerOff();
        assertFalse(ac.getPowerOn());
    }

    @Test
    public void decreaseTemperature() {
        ac.setControl(18);
        int result = ac.decreaseTemp();
        assertEquals(17, result);
    }

    @Test
    public void increaseTemperature() {
        ac.setControl(17);
        int result = ac.increaseTemp();
        assertEquals(18, result);
    }

    @Test
    public void maxDecreaseTemperature() {
        ac.setControl(15);
        int result = ac.decreaseTemp();
        assertEquals(16, result);

    }

    @Test
    public void maxIncreaseTemperature() {
        ac.setControl(31);
        int result = ac.increaseTemp();
        assertEquals(30, result);


    }
}