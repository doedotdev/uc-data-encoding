import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class testClassTest {
    @Test
    public void getValue() throws Exception {
        testClass item = new testClass(5);
        assertEquals(item.getValue(), 5);
    }

}