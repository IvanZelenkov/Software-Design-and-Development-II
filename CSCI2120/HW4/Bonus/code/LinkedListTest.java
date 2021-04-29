import static org.junit.Assert.*;
import org.junit.*;

/**
 * Class tests multiple operations with elements in the list.
 * @author Ivan Zelenkov
 * @version 1.0
 * @since April 29, 2021
 */
public class LinkedListTest {
    LinkedList list1;
    LinkedList list2;
    LinkedList.Iterator iterator1;
    LinkedList.Iterator iterator2;

    /**
     * This method will be executed each time before the test method.
     */
    @Before
    public void setup() {
        list1 = new LinkedList();
        list2 = new LinkedList();
        iterator1 = list1.getIterator();
        iterator2 = list2.getIterator();
        list1.add(new Dog("Fifi", 12, 8));
        list1.add(new Dog("Butch", 10, 10));
        list1.add(new Dog("Leonard", 22, 13));
        list1.add(new Dog("Spot", 17, 9));
    }

    /**
     * Test if elements of two lists will be equal after addition.
     */
    @Test
    public void addTest() {
        for (int i = 0; i < list1.size(); i++) {        // iterate through the list
            list2.add(list1.get(i));                    // add elements of linkedList to the list
            assertEquals(list1.get(i), list2.get(i));   // use assertEquals which compares the element of list with the element of linkedList by the same index
        }
    }

    /**
     * Test if list contains the desired object.
     */
    @Test
    public void containsTest() {
        Dog newDog1 = new Dog("RandomDog1", 17, 30);
        Dog newDog2 = new Dog("RandomDog2", 30, 40);

        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
            assertTrue(list1.contains(list2.get(i)));
            assertTrue(list2.contains(list1.get(i)));
        }

        list1.add(newDog1, 1);
        list1.add(newDog2, list1.size());

        assertTrue(list1.contains(newDog1));  // use assertTrue because we show that list1 should contain newDog1
        assertTrue(list1.contains(newDog2));  // use assertTrue because we show that list1 should contain newDog1
        assertFalse(list2.contains(newDog1)); // use assertFalse because we show that list2 does not contain newDog1
        assertFalse(list2.contains(newDog2)); // use assertFalse because we show that list2 does not contain newDog2
    }

    /**
     * Test if the index of element matches the expected index.
     */
    @Test
    public void indexOfAndAddByIndexTest() {
        Dog newDog1 = new Dog("RandomDog1", 17, 30);
        Dog newDog2 = new Dog("RandomDog2", 30, 40);
        Dog newDog3 = new Dog("RandomDog3", 24, 50);
        Dog newDog4 = new Dog("RandomDog4", 11, 27);

        list1.add(newDog1);
        list1.add(newDog2, 3);
        list1.add(newDog3, 35);
        list1.add(newDog4, 4);

        assertEquals(list1.size() -1, list1.indexOf(newDog1));
        assertEquals(3, list1.indexOf(newDog2));
        assertEquals(-1, list1.indexOf(newDog3));
        assertEquals(4, list1.indexOf(newDog4));
    }

    /**
     * Test if method method return the same next element of both list.
     */
    @Test
    public void iteratorNext1Test() {
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        assertEquals(iterator1.next(), iterator2.next());
    }

    /**
     * Test if method method return next element of the list.
     */
    @Test
    public void iteratorNext2Test() {
        Dog newDog1 = new Dog("RandomDog1", 17, 30);
        list2.add(newDog1);
        assertEquals(newDog1, iterator2.next());
    }

    /**
     * Test if method method return previous element.
     */
    @Test
    public void priorTest() {
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        assertEquals(iterator1.prior(), iterator2.prior());
    }

    /**
     * Test how iterator goes through the list from start.
     */
    @Test
    public void hasNextAndNextTest() {
        Dog newDog1 = new Dog("RandomDog1", 17, 30);
        list2.add(newDog1);

        while (iterator2.hasNext()){
            assertEquals(newDog1, iterator2.next());
        }
        assertFalse(iterator2.hasNext());
    }

    /**
     * Test how iterator goes through the list from end.
     */
    @Test
    public void hasPriorAndPriorTest() {
        Dog newDog1 = new Dog("RandomDog1", 17, 30);
        list2.add(newDog1);

        while (iterator2.hasPrior()){
            assertEquals(newDog1, iterator2.prior());
        }
        assertFalse(iterator2.hasPrior());
    }

} // end of Tester class