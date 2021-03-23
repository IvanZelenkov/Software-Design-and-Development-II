import static org.junit.Assert.*;
import org.junit.*;

public class DieTester {
    Die dieDefault = new Die();
    Die dieCustom = new Die(5);

    @Test
    public void testDefaultRoll() {
        int num = dieDefault.roll();
        if (num > 0 && num <= 6)
            assertEquals(dieDefault.getResult(), num);
    }

    @Test
    public void test5SideRoll() {
        int num = dieCustom.roll();
        if (num > 0 && num <= 5)
            assertEquals(dieCustom.getResult(), num);
    }

    @Test
    public void testDefaultNumSides() {
        assertEquals(6, dieDefault.getNumSides());
    }

    @Test
    public void test5NumSides() {
        assertEquals(5, dieCustom.getNumSides());
    }

    @Test
    public void testGetDefaultResult() {
        assertEquals(1, dieDefault.getResult());
    }

    @Test
    public void testGet5SideResult() {
        assertEquals(1, dieCustom.getResult());
    }

    @Test
    public void testEqualsTrue() {
        assertEquals(dieDefault, dieDefault);
        assertEquals(dieCustom, dieCustom);
    }

    @Test
    public void testEqualsFalse() {
        assertNotEquals(dieDefault, dieCustom);
    }

    @Test
    public void testDefaultToString() {
        assertEquals("Num sides 6 result 1", dieDefault.toString());
    }

    @Test
    public void test5SideToString() {
        assertEquals("Num sides 5 result 1", dieCustom.toString());
    }
}
