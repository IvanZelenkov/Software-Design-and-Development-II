package handin;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*;

public class TestSinglyLinkedList {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream systemOut = System.out;
	private SinglyLinkedList listA;
	
	@Before
	public void setUp()
	{
		System.setOut(new PrintStream(output));
		listA = new SinglyLinkedList("testList");
	}
	
	@Test
	public void testGetByIndex() {
		listA.add(10);
		listA.add(20);
		listA.add(30);
		assertEquals(10, listA.getByIndex(0));
		assertEquals(20, listA.getByIndex(1));
		assertEquals(30, listA.getByIndex(2));
	}	
	
	@Test
	public void testAdd()
	{
		listA.add(1);
		listA.add(2);
		listA.add(3);
		assertEquals(1, listA.getByIndex(0));
		assertEquals(2, listA.getByIndex(1));
		assertEquals(3, listA.getByIndex(2));
	}
	
	@Test
	public void testAddByIndex()
	{
							//index
		listA.add(10);		//0
		listA.add(20);		//1
		listA.add(30);		//2 becomes 3
		listA.addByIndex(2, 25);	//2
		listA.add(40);		//4
		assertEquals(25, listA.getByIndex(2));
		assertEquals(30, listA.getByIndex(3));
	}
	
	@Test
	public void removeByElement()
	{
							//index
		listA.add(10);		//0
		listA.add(20);		//1
		listA.add(30);		//2
		listA.add(40);		//3
		listA.removeByElement(20);
		assertEquals(40, listA.getByIndex(2));
		listA.removeByElement(10);
		assertEquals(30, listA.getByIndex(0));
	}

	@Test
	public void removeByIndex()
	{
							//index
		listA.add(10);		//0
		listA.add(20);		//1
		listA.add(30);		//2
		listA.add(40);		//3
		listA.removeByIndex(1);
		assertEquals(40, listA.getByIndex(2));
		listA.removeByIndex(0);
		assertEquals(30, listA.getByIndex(0));
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}
}
