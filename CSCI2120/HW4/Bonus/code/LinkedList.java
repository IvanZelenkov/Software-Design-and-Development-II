/**
 * LinkedList creates the nodes and connects them.
 * @author Ivan Zelenkov
 * @version 1.0
 * @since April 29, 2021
 * @param <T> This stands for generic class. A generic class is a class that can work with any data type, or in other words, we can say that it is independent of the data type.
 */
public class LinkedList<T> {

    Node itsFirstNode;
    Node itsLastNode;
    private int size;

    /**
     * Constructor build LinkedList object.
     */
    public LinkedList() {
        itsFirstNode = null;
        itsLastNode = null;
        size = 0;
    }

    /**
     * Getter method to get size of the list.
     * @return Return the size of the list.
     */
    public int size() {
        return this.size;
    }

    /**
     * Getter method to get iterator object.
     * @return Return the iterator.
     */
    public Iterator<T> getIterator() {
        return new Iterator<T>(this);
    }

    /**
     * Method add a new node with element to the end of the list.
     * @param element Element type of T while will be stored in Node.
     */
    public void add(T element) {
        Node newNode = new Node(element);
        if (itsFirstNode == null) {             // if the first node is null, then reference new node to be first and last node because it is a first node in list
            itsFirstNode = newNode;             // new node become the first node
            itsLastNode = newNode;              // new node become the last node
        }
        else {                                  // if we already have any nodes, then add new node to the end
            itsLastNode.setNextNode(newNode);   // set the link from lastNode -> to the new node (lastNode -> node)
            newNode.setPriorNode(itsLastNode);  // set the link from node to lastNode, which is before (lastNode <- node)
            itsLastNode = newNode;              // new node become the last node
        }
        size++;                                 // increment the size of the list because new node was added
    }

    /**
     * Method add a new node with element to the specific index of the list.
     * @param element Element type of T while will be stored in Node.
     * @param index Index at which we want to insert the element.
     */
    public void add(T element, int index) {
        if (index < 0 || index > size)          // if argument index is smaller than 0 and larger than size of the LinkedList, then find by element find the index
            indexOf(element);
        else if (index == size)                 // if index equals size of the list, then it means that the element will be added to the end of the list
            add(element);                       // use add(element) to add element to the end of the list
        else {                                  // if (index > 0 || index < size) -> (0, size)
            int counter = 0;                    // declare and initialize counter to 0
            Node newNode = new Node(element);   // assign new node to the newNode object of the class Node
            Node current = itsFirstNode;        // assign itsFirstNode to the current, so current become the first node
            while (current != null) {           // while current not reached the null, which means the end of the linked list
                if (counter == index)           // if counter will be equal index which we want to insert
                    break;                      // call break, so the while loop will be finished immediately without any next operations
                current = current.getNextNode();// get next node of current node and assign it to current, so the while loop will be updated
                counter++;                      // increment counter, while counter not equal index
            }
            Node previous = current.getPriorNode(); // get the prior node from method getPriorNode() and assign it to previous object
            if (previous == null)               // if previous node is null
                itsFirstNode = newNode;         // first node become new node
            else {
                previous.setNextNode(newNode);  // link previous node to the newNode (previous -> newNode)
                newNode.setPriorNode(previous); // link newNode to the previous node (previous <- newNode)
            }

            newNode.setNextNode(current);       // link newNode to the next node which is in the next cell after newNode (newNode -> next node after current)
            current.setPriorNode(newNode);      // link current node to the newNode (current -> newNode)
                                                // Result: current -> newNode -> current.nextNode
            size++;                             // increment the size of the list because new node was added
        }
    }

    /**
     * Getter method to get the element by index.
     * @param index Contains the index that was passed to the method.
     * @return Return data of the desired node.
     */
    public T get(int index) {
        int counter = 0;
        Node current = itsFirstNode;                // let current be the first node
        while (current != null && counter < size) {
            if (counter == index) {
                break;
            }
            current = current.getNextNode();        // get next node of current node and assign it to current, so the while loop will be updated
            counter++;                              // increment counter, while counter not equal index
        }
        return current.getData();                   // return data of the desired node
    }

    /**
     * Method to check if list contains a specific element.
     * @param element Check if this element is in the list.
     * @return Return true if element is in the list, otherwise return false.
     */
    public boolean contains(T element) {
        Node current = itsFirstNode;                // let current be the first node
        if (size != 0) {                            // if size not equal zero, then true. Otherwise false
            while (current != null) {
                if ((current.getData()).equals(element)) { // if the current node data equals to the given element, return true(element exist)
                    return true;
                }
                current = current.getNextNode();    // get next node of current node and assign it to current, so the while loop will be updated
            }
        }
        return false;   // otherwise return false (list does not contain the given element)
    }

    /**
     * Method finds the index of element.
     * @param element Element at which we want to find the index.
     * @return Return the index of the element if it is in the list, -1 if not found.
     */
    public int indexOf(T element) {
        Node current = itsFirstNode;                // let current be the first node
        if (size != 0) {                            // if size not equal zero, then true. Otherwise false
            int index = 0;                          // initialize (index) integer variable to 0
            while (current != null) {
                if ((current.getData()).equals(element)) { // if the current node data equals to the given element, return index of that element
                    return index;
                }
                index++;                            // increment index counter
                current = current.getNextNode();    // get next node of current node and assign it to current, so the while loop will be updated
            }
        }
        return -1;  //otherwise, return -1 (element was not found)
    }

    /**
     * Method checks if element is in the list using an iterator.
     * @param element Element we want to check if it is in the list.
     * @return Return an Iterator at the location of the element if it is in the list and returns the null reference if the element is not found.
     */
    public Iterator<T> iteratorAt(T element) {
        Iterator<T> iterator = getIterator();       // instantiate iterator object
        while (iterator.hasNext()) {                // while iterator iterates through list, loop condition will be true
            if (iterator.next() == element) {       // if iterator at the location of the element, return true;
                return iterator;
            }
        }
        return null; // otherwise, if element is not found, return null
    }

    /**
     * Getter method to get the first node.
     * @return Return the first node.
     */
    public Node getFirst() {
        return itsFirstNode; // return the first node
    }

    /**
     * Getter method to get the last node.
     * @return Return the last node.
     */
    public Node getLast()  {
        return itsLastNode; // return the last node
    }

    /**
     * Method return a list representing the nodes in formatted style.
     * @return Return a list representing the nodes in formatted style.
     */
    public String toString() {
        String returnVal = "";
        Node current = itsFirstNode;
        if (size != 0) {
            while (current != null) {
                returnVal += current.toString();
                returnVal += "\n";
                current = current.getNextNode();
            }
        }
        return returnVal;
    }  // end toString

    /**
     * Node class that is used to create separate data storage units for different data structures. Also it contains data and links.
     */
    class Node {

        private T data;
        private Node itsNext;
        private Node itsPrior;

        /**
         * Constructor build Node object.
         * @param data Node object of type T will be created.
         */
        public Node(T data) {
            itsNext = null;
            itsPrior = null;
            this.data = data;
        }

        /**
         * Getter method to get data of the node.
         * @return Return data of the node.
         */
        public T getData() {
            return this.data;
        }

        /**
         * Getter method to get the next node.
         * @return Return the next node.
         */
        public Node getNextNode() {
            return itsNext;
        }

        /**
         * Getter method to get the prior node.
         * @return Return the last node.
         */
        public Node getPriorNode() {
            return itsPrior;
        }

        /**
         * Mutator method to set the next node.
         * @param next The node object will be passed to set it to next node.
         */
        public void setNextNode(Node next) {
            itsNext = next;
        }

        /**
         * Mutator method to set the prior node.
         * @param prior The node object will be passed to set it to prior node.
         */
        public void setPriorNode(Node prior) {
            itsPrior = prior;
        }

        /**
         * Method return a string representing the data of node int string.
         * @return Return a string representing the data of node in list.
         */
        public String toString() {
            return data.toString();
        }
    }  // end of Node class

    /**
     * Iterator class is used to loop through collections.
     * @author Ivan Zelenkov
     * @version 1.0
     * @since April 29, 2021
     * @param <T> This stands for generic class. A generic class is a class that can work with any data type, or in other words, we can say that it is independent of the data type.
     */
    class Iterator<T> {

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


} // end of LinkedList class