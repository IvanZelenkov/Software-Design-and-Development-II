/**
 * Iterator class is used to loop through collections.
 * @author Ivan Zelenkov
 * @version 1.0
 * @since April 29, 2021
 * @param <T> This stands for generic class. A generic class is a class that can work with any data type, or in other words, we can say that it is independent of the data type.
 */
public class Iterator<T> {

    private LinkedList<T> myList;
    private LinkedList<T>.Node myCurrentNode;

    /**
     * Constructor build Iterator object
     * @param list Iterator object of type T will be created.
     */
    public Iterator(LinkedList<T> list) {
        myList = list;
        myCurrentNode = myList.itsFirstNode; // current node will be the first node of the list
    }

    /**
     * Method is used to check if there are more elements.
     * @return Method returns true if the iterator has more elements.
     */
    public boolean hasNext() {
        if (myCurrentNode == null) { // if current node is null, then check if the first node is null
            return false;
        }
        return true; // otherwise, check next node if it is a null
    }

    /**
     * Method to check if there is a prior node.
     * @return Return true if there is a "prior" element, otherwise returns false.
     */
    public boolean hasPrior() {
        if (myCurrentNode == null) { // if current node is null, then check if the first node is null
            return false;
        }
        return true; // otherwise, check next node if it is a null

    }

    /**
     * Method to get data of the next node.
     * @return Returns the "next" node (really the current one) and moves the Iterator forward by one node.
     */
    public T next() {
        if (myCurrentNode == null) {
            myCurrentNode = myList.getFirst();
            return myCurrentNode.getData();
        } else {
            T data = myCurrentNode.getData();               // send data of the current node to the generic object data
            myCurrentNode = myCurrentNode.getNextNode();    // make the current node to be the next node
            return data;                                    // return the data of that current node
        }
    }

    /**
     * Method to get data of the prior node.
     * @return Returns the "prior" node (really the current one) and moves the Iterator backward by one node.
     */
    public T prior() {
        if (myCurrentNode == null) {
            myCurrentNode = myList.getFirst();
            return myCurrentNode.getData();
        } else {
            T data = myCurrentNode.getData();
            myCurrentNode = myCurrentNode.getPriorNode();
            return data;
        }
    }

    /**
     * Sets the last node to the current node.
     */
    public void setToEnd() {
        myCurrentNode = myList.getLast();   // current node become the last node of the list
    }

} // end of Iterator class


