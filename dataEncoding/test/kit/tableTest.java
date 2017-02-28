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

    @Test
    public void multTable1() throws Exception {
        table object = new table();
        object.setMod(2);
        object.multTable();
    }

    @Test
    public void multTable2() throws Exception {
        table object = new table();
        object.setMod(10);
        object.multTable();
    }

    @Test
    public void multTable3() throws Exception {
        table object = new table();
        object.setMod(50);
        object.multTable();
    }

    @Test
    public void powTable1() throws Exception {
        table object = new table();
        object.setMod(3);
        object.powTable();
    }

    @Test
    public void powTable2() throws Exception {
        table object = new table();
        object.setMod(10);
        object.powTable();
    }

    @Test
    public void powTable3() throws Exception {
        table object = new table();
        object.setMod(50);
        object.powTable();
    }

    @Test
    public void printAll() throws Exception {
        table object = new table();
        object.setMod(5);
        object.addTable();
        object.multTable();
        object.powTable();
    }

}