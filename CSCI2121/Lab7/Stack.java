import java.util.ArrayList;

public class Stack<T> {

	ArrayList<T> list;

	/** You might want to use arraylist for this too */
	public Stack() {
		this.list = new ArrayList<>();
	}

	/**
	 * Returns the number of components in this stack.
	 *
	 * @return the number of components in the stack
	 */
	public int getSize() {
		return list.size() - 1;
	}

	/**
	 * Tests if this stack is empty.
	 *
	 * @return true if the stack is empty false otherwise
	 */
	public boolean isEmpty() {
		return false;
	}

	/**
	 * Pushes an item onto the top of this stack.
	 */
	public void push(T item) {
		list.add((T) item);
	}

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 *
	 * @return the object at the top of this stack
	 */
	public T peek() {
		return list.get(list.size() - 1);
	}

	/**
	 * Removes the object at the top of this stack and returns that object as the
	 * value of this function.
	 *
	 * @return The object at the top of this stack
	 */
	public T pop() {
		T element = list.remove(list.size() - 1);
		return element;
	}

	/**
	 * Prints each component of the stack separated by a new line character.
	 *
	 * @returns The string representation of the stack
	 */
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (T s : list) {
			string.append(s).append("\n");
		}
		return string.toString();
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		stack.pop();
		stack.pop();
		System.out.println(stack.toString());

		stack.push("still");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
}
