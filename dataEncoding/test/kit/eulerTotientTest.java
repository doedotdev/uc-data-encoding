package kit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class eulerTotientTest {
    @Test
    public void tot1() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(12);
        assertEquals(object.getTotient_number(), 4);
    }

    @Test
    public void tot2() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(100);
        assertEquals(object.getTotient_number(), 40);
    }

    @Test
    public void tot3() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(1);
        assertEquals(object.getTotient_number(), 1);
    }

    @Test
    public void tot4() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(0);
        assertEquals(object.getTotient_number(), 0);
    }

    @Test
    public void tot5() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(1000);
        assertEquals(object.getTotient_number(), 400);
    }

    @Test
    public void tot6() throws Exception {
        eulerTotient object = new eulerTotient();
        object.setValue(5);
        assertEquals(object.getTotient_number(), 4);
    }
}