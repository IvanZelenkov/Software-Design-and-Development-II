import static org.junit.Assert.*;
import org.junit.*;

public class CustomArrayTester {
    private CustomArray c;

    @Before
    public void setup() {
        System.out.println("setup");
        int[] data = new int[] {1, 2, 3, 4, 5};
        c = new CustomArray(data);
    }

    @Test
    public void testSetElement() {
        // test
        // in the index 0 of array we assign integer 100
        c.setElement(0, 100);
        assertEquals(100, c.getElement(0));
    }

    @Test
    public void testGetElementSuccess() {
        // test
        int zeroIndex = c.getElement(0);
        assertEquals(1, zeroIndex);
    }

    @Test
    public void testGetElementFail() {
        // test
        assertNotEquals(5, c.getElement(1));
    }

    @Test
    public void testGetLength() {
        // test
        assertEquals(5, c.length());
    }

    @Test
    public void testEquals() {
        CustomArray c1 = new CustomArray(new int[] {1, 2, 3, 4, 5});
        assertEquals(c, c1);
    }

    @Test
    public void testToString() {
        assertEquals("1, 2, 3, 4, 5", c.toString());
    }

    @Test
    public void testReverse() {
        c.reverse();
        CustomArray c1 = new CustomArray(new int[] {5, 4, 3, 2, 1});
        assertEquals(c, c1);

    }

    @Test
    public void testContains() {
        assertTrue(c.contains(1));
        assertFalse(c.contains(-1));
    }

//    @Test
//    public void test1() {
//        System.out.println("test1");
//        assertTrue(true);
//    }
//
//    @Test
//    public void test2() {
//        System.out.println("test2");
//        assertTrue(true);
//    }

}
