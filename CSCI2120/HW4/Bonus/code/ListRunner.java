/**
 * ListRunner to construct the Dog list using LinkedList.
 * @author Ivan Zelenkov
 * @version 1.0
 * @since April 29, 2021
 */
public class ListRunner {

    /**
     * Main method which run the code.
     * @param args args is an array of sequence of characters (Strings) that are passed to the "main" function.
     */
    public static void main(String[] args) {

        Dog fifi = new Dog("Fifi", 12, 8);
        Dog butch = new Dog("Butch", 10, 10);
        Dog leonard = new Dog("Leonard", 22, 13);
        Dog spot = new Dog("Spot", 17, 9);

        LinkedList<Dog> myDogList = new LinkedList<>();

        System.out.println(myDogList);
        System.out.println();
        myDogList.add(fifi);

        System.out.println(myDogList);
        System.out.println();

        myDogList.add(butch);
        myDogList.add(leonard);
        myDogList.add(spot);

        System.out.println(myDogList);
        System.out.println();

        Dog jack = new Dog("Jack", 18, 18);

        myDogList.add(jack,1);

        System.out.println(myDogList);
        System.out.println();

        // the following lines build Iterators, and provide an example
        // of how you would use an Iterator to step through this data
        // structure
        LinkedList.Iterator iter1 = myDogList.getIterator();
        LinkedList.Iterator iter2 = myDogList.getIterator();

        System.out.println("Iterating using Iterators!!!");
        while (iter1.hasNext()) {
            Dog foo = (Dog) iter1.next();
            System.out.println(foo);
        }

        System.out.println();
        // In a doubly-linked list, an iterator can move either forward or backward,
        // so this should the print the list out in reverse order if you've correctly
        // implemented everything

        System.out.println("Iterating backwards using Iterators!!!");
        iter2.setToEnd();
        while (iter2.hasPrior()) {
            Dog foo = (Dog) iter2.prior();
            System.out.println(foo);
        }

    }// end main

} // end class ListRunner