package handin;

/**
* A class that models a SinglyLinkedList with add(), addByIndex(), removeByElement(),
* removeByIndex(), and toString() methods. A SinglyLinkedList "knows" only its head node.
* It contains an inner Node class. A Node object "knows" only its data (e.g., an int in this case) 
* and the next node.
*
* @author	PUT YOUR NAME HERE
* @version	PUT THE DATE HERE
*/
public class SinglyLinkedList {

	private String listName;
	private Node head;
	
	public SinglyLinkedList(String listName) {
		this.listName = listName;
		this.head = null;
	}
	
	/**
	* Returns an element specified by index from the list.
	*
	* @param index
	* @return	int		value
	*/
	public int getByIndex(int index) {
		Node current = this.head;
		if(index < 0) {
			//If the index is less than zero we return -999.
			return -999;
		} else if(index == 0 && current != null) {
			//If the index is the first index we will return whatever value is the head node.
			return current.data;
		} else {
			//In all other cases iterate through the nodes until the correctly indexed node is found.
			//Then we would return the data inside the node.
			for (int i = 0; i < index; i++) {
				if (current != null) {
					current = current.next;
				}
			}
			return current.data;
		}
	}
	
	/**
	* Adds an element to the end of the list.
	*
	* @param element
	*/
	public void add(int element) {
		Node newNode = new Node(element);
		
		if (head == null) {
			//Provide implementation where element is added at the head node.
			head = newNode;
		} else {
			//Provide implementation where element is added to a list that is not empty.
			//One way is to make the head node the tail node and "iterate" through by 
			//making the tail node's next node the new tail and then assigning the new 
			//node as the tail node's next node.
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	/**
	* Adds an element to the list at a specified index.
	*
	* @param index
	* @param element
	*/
	public void addByIndex(int index, int element) {
		int printIndex = index;
		Node newNode = new Node(element);
		Node current = head;
		
		if (index == 0) {
			//Provide implementation where the index at which to add an element is 0.
			newNode.next = head; // new node will point to the head (newNode -> head)
			head = newNode;

			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + index + ".");
		}
		else {
			//Provide implementation where the index at which to add an element is greater than 0.
			int counter = 0;
			while(counter < index - 1) {
				current = current.next;
				counter++;
			}
			newNode.next = current.next;
			current.next = newNode;
//			ну вот от головного элемента через цикл мы добрались до того, который с индексом index-1.
//			пусть будет [i-1] для краткости. элементы [i-1] и [i] между собой связаны ссылкой next: [i-1].next = [i].
//			мы хотим вставить новый элемент на место [i]. элемент, бывший [i] при этом становится [i+1]
//			(но чтобы не запутаться, я не буду менять пока индексы). чтобы встроить новый элемент в цепь,
//			мы перезаписываем ссылку  [i-1].next = newNode, а сам newNode ссылается на следующий в цепи newNode.next=[i]

			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + printIndex + ".");
		}
	}
	
	/**
	* Removes an element from the list.
	*
	* @param element
	*/
	public void removeByElement(int element) {
		Node current = this.head;
		Node previous = null;

		if (current != null && current.data == element) {
			//Provide implementation when removing the element from the head.
			head = current.next; // change head

			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was found and removed.");
		} else {
			while(current != null && current.data != element) {

				//Provide implementation to "iterate" through your linked list.
				// if current node does not hold the key, continue to next node
				previous = current;
				current = current.next;

			}
			//If element was found, then it is at the current node.  Remove it.
			if (current != null) {
				//Provide implementation to remove the desired element--e.g., the current node.
				previous.next = current.next; // unlink current node from linked list
				
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was found and removed.");
			}
			//If element was not found, then the current node should be null.
			if (current == null) {
				// Just display the message. current will be null anyway
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was not found.");
			}
		} 		
	}
	
	/**
	* Removes an element specified by index from the list.
	*
	* @param index
	*/
	public void removeByIndex(int index) {
		Node current = this.head;
		Node previous = null;
		
		if (index == 0 && current != null) {
			//Provide implementation where the index from which to remove is 0.
			head = current.next; // change head, so head will be the next element after element in index 0
			
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element at index " + index + " removed.");
		} else {
			int counter = 0;
		
			while(current != null) {

				if (counter == index) {
					//Provide implementation to remove the element from the specified index.
					// unlink current node from linked list. previous node, which will be the the current, will point on next element after current. previous(current) --> next
					previous.next = current.next;
					//KEEP THIS LINE TO PRINT RESULT!
					System.out.println("Element at index " + index + " removed.");
					break;
				} else {
					//Continue "iterating" through your linked list and increment the counter.
					previous = current;
					current = current.next;
					counter++;
					
				}
			}	
			//If the element at the specified index was found, then it should be at the current node.
			if (current == null) {
				// Just display the message. current will be null anyway
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("The element at index " + index + " was not found.");
			}
		}
	}
	
	@Override
	public String toString() {
		String list = "LinkedList: ";
		Node current = this.head;  
   
        while (current != null) {  
            list = list + current.data + " "; 
            current = current.next; 
        }
		return list + "\n";
	}
	
	public class Node {
		private int data;
		private Node next;
				
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}