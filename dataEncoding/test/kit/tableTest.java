package kit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjamin.horn on 2/27/17.
 */
public class tableTest {
    @Test
    public void setMod() throws Exception {
        table object = new table();
        object.setMod(10);
        assertEquals(object.getMod(), 10);
        object.setMod(8);
        assertEquals(object.getMod(), 8);
    }

    @Test
    public void getMod() throws Exception {
        table object = new table();
        object.setMod(10);
        assertEquals(object.getMod(), 10);
        object.setMod(8);
        assertEquals(object.getMod(), 8);
    }

    @Test
    public void addTable1() throws Exception {
        table object = new table();
        object.setMod(2);
        object.addTable();
    }

    @Test
    public void addTable2() throws Exception {
        table object = new table();
        object.setMod(10);
        object.addTable();
    }

    @Test
    public void addTable3() throws Exception {
        table object = new table();
        object.setMod(50);
        object.addTable();
    }

}