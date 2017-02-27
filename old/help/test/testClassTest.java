import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class testClassTest {
    @Test
    public void getStr() throws Exception {
        testClass thing = new testClass("hello");
        assertEquals(thing.getStr(), "hello");
    }
    @Test
    public void getStr2() throws Exception {
        testClass thing = new testClass("");
        assertEquals(thing.getStr(), "");
    }

}