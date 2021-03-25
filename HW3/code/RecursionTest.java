import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

/**
 * Class tests unicode characters in given strings to check if it finds smallest string among others
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since March 24, 2021
 */

public class RecursionTest {

    /**
     * Test methods which tests the space characters as a smallest string.
     */
    @Test
    public void testSpace() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("  ");
        arr.add("X-ray");
        arr.add("prediction");
        arr.add("TRUE");
        arr.add("elec troN");
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("  ", Recursion.findMinimum(arr));
    }

    /**
     * Test methods which tests the random words.
     */
    @Test
    public void testWords() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("chaos");
        arr.add("X-ray");
        arr.add("prediction");
        arr.add("TRUE");
        arr.add("electro");
        // String is an Object in java, so it falls into that category of comparison rules.
        // JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("chaos", Recursion.findMinimum(arr));
    }

    /**
     * Test methods which tests the model's name of assault rifles which contains different charset.
     */
    @Test
    public void testModels() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("AK-47");
        arr.add("AK-15");
        arr.add("AK-19");
        arr.add("AK-109");
        arr.add("RPK-74");
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("AK-109", Recursion.findMinimum(arr));
    }

    /**
     * Test methods which tests names of people.
     */
    @Test
    public void testNames() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Victor Nosov");
        arr.add("Daniil Vasiliev");
        arr.add("Ivan Zelenkov");
        arr.add("Gregory Petrov");
        arr.add("Rostislav Opihaylenko");
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("Daniil Vasiliev", Recursion.findMinimum(arr));
    }

    /**
     * Test methods which tests the characters. This is the best test method which shows that the Recursion class works properly.
     */
    @Test
    public void testSymbols() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("!!!");
        arr.add("ЖЖЖ");
        arr.add("###");
        arr.add("ЪЪЪ");
        arr.add("$$$");
        arr.add("ЦЦЦ");
        arr.add("%%%");
        arr.add("&&&");
        arr.add("ЫЫЫ");
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("!!!", Recursion.findMinimum(arr));
    }
}
