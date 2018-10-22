


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();


	/**
	* testNewAccountsType checks for valid input types in the 1st parameter
	*/
	@Test
	public void testNumber() {
	   data.initializeArray("20");
	   assertTrue(data.myArray.length == 20);
	   
	   data.initializeArray("30");
	   assertTrue(data.myArray.length == 30);
	   
	   data.initializeArray("0");
	   assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
	    data.initializeArray("-3");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
	    data.initializeArray("5.5 7 9");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
	    data.initializeArray("");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
	    data.initializeArray("5 8 y 4");  
	}
	
	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
	    data.initializeArray("5 5 64 4 4");  
	    
	    SortDemoData data2 = new SortDemoData();
	    data2.initializeArray("5 5 64 4 4");
		assertTrue(data.myArray.length == 5);
		assertTrue(data.myArray[0].key == data2.myArray[0].key );
		assertTrue(data.myArray[1].key == data2.myArray[1].key );
		assertTrue(data.myArray[2].key == data2.myArray[2].key );
	}

	
	
	// TODO: Include your test cases below
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestBubbleSortInputNull() {
		SortAlgos.bubbleSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestBubbleSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.bubbleSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestBubbleSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.bubbleSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Edge (1)
	 */
	@Test
	public void TestBubbleSortInputUnsortedLenghtZero() {
		Item[] items = new Item[0];
		SortAlgos.bubbleSort(items);
		assertTrue(items.length == 0);
	}
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestinsertionSortInputNull() {
		SortAlgos.insertionSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestinsertionSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.insertionSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestinsertionSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.insertionSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Edge (1)
	 */
	@Test
	public void TestinsertionSortInputUnsortedLenghtZero() {
		Item[] items = new Item[0];
		SortAlgos.insertionSort(items);
		assertTrue(items.length == 0);
	}
	
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestmergeSortInputNull() {
		SortAlgos.mergeSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestmergeSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.mergeSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestmergeSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.mergeSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestquickSortInputNull() {
		SortAlgos.quickSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestquickSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.quickSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestquickSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.quickSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestheapSortInputNull() {
		SortAlgos.heapSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestheapSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.heapSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestheapSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.heapSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Edge (1)
	 */
	@Test
	public void TestheapSortInputUnsortedLenghtZero() {
		Item[] items = new Item[0];
		SortAlgos.heapSort(items);
		assertTrue(items.length == 0);
	}
	
	
	
	/**
	 * Testing the null node and conditional coverage (Node 1 and Conditional 2)
	 */
	@Test (expected = NullPointerException.class)
	public void TestselectionSortInputNull() {
		SortAlgos.selectionSort(null);
	}
	
	/**
	 * (Node 2, Edge 1)
	 */
	@Test
	public void TestselectionSortInputUnosrted() {
		Item[] items = new Item[3];
		items[0] = new Item(4);
		items[1] = new Item(1);
		items[2] = new Item(2);
		int[] sortedValues = {1, 2, 4};
		SortAlgos.selectionSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	
	
	/**
	 * Sequence - (Conditional 1)
	 */
	@Test
	public void TestselectionSortInputSorted() {
		Item[] items = new Item[2];
		items[0] = new Item(2);
		items[1] = new Item(1);
		int[] sortedValues = {1, 2};
		SortAlgos.selectionSort(items);
		for(int i = 0; i < items.length; i++) {
			assertTrue(items[i].key == sortedValues[i]);
		}
	}
	
	/**
	 * Edge (1)
	 */
	@Test
	public void TestselectionSortInputUnsortedLenghtZero() {
		Item[] items = new Item[0];
		SortAlgos.selectionSort(items);
		assertTrue(items.length == 0);
	}
	
}
