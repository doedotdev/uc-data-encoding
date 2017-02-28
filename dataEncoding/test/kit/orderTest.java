package kit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class orderTest {
    @Test
    public void order1() throws Exception {
        order object = new order(4,7);
        assertEquals(object.order(), 3, 0);

    }

    @Test
    public void order2() throws Exception {
        order object = new order(10,7);
        assertEquals(object.order(), 6, 0);

    }

    @Test
    public void order3() throws Exception {
        order object = new order(100, 10);
        assertEquals(object.order(), -1, 0);

    }


}