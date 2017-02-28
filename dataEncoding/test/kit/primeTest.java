package kit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class primeTest {
    @Test
    public void isPrimeSlow() throws Exception {
        prime object = new prime();
        object.setValue(2017);
        assertTrue(object.isPrimeSlow());
        assertTrue(object.isPrimeFaster());
    }

    @Test
    public void testBaseCase1() throws Exception {
        prime object = new prime();
        object.setValue(0);
        assertFalse(object.isPrimeSlow());
        assertFalse(object.isPrimeFaster());
    }

    @Test
    public void testBaseCase2() throws Exception {
        prime object = new prime();
        object.setValue(1);
        assertFalse(object.isPrimeSlow());
        assertFalse(object.isPrimeFaster());
    }

    @Test
    public void testBaseCase3() throws Exception {
        prime object = new prime();
        object.setValue(2);
        assertTrue(object.isPrimeSlow());
        assertTrue(object.isPrimeFaster());
    }

    @Test
    public void printSlow() throws Exception {
        prime object = new prime();
        object.printSlow(1234);
    }

    @Test
    public void printFast() throws Exception {
        prime object = new prime();
        object.printFast(1234);
    }

    @Test
    public void printSlow2() throws Exception {
        prime object = new prime();
        object.printSlow(123456);
    }

    @Test
    public void printFast2() throws Exception {
        prime object = new prime();
        object.printFast(123456);
    }


}