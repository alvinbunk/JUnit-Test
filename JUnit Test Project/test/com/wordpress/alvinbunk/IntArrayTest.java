package com.wordpress.alvinbunk;

import static org.junit.Assert.*;

//import org.junit.Ignore;
import org.junit.Test;

public class IntArrayTest {

	@Test
	public void testIntArray() {
		// Create the array.
		IntArray testArray = new IntArray(5);
		
		// Since object is created it is not null.
		assertNotNull(testArray);
		
		// Now check that the array is empty.
		assertTrue(testArray.isEmpty());
		
		// Check adding a number.
		testArray.add(13);
		// Add two more integers.
		testArray.add(5);
		testArray.add(3);
		
		// Check that entry "1" is equal to "5".
		assertEquals(5,testArray.get(1));
		
		// Check that the array is NOT empty.
		assertFalse(testArray.isEmpty());
		
		// Does the array contain "3"? It should!
		assertTrue(testArray.contains(3));
		
		testArray.remove();	// Removes "3".
		testArray.remove();	// Removes "5".
		
		// Check if empty - it is NOT.
		assertFalse(testArray.isEmpty());
		
		testArray.remove();	// Removes "13"
		
		// This should fail!
		assertEquals(-1,testArray.size());
	}
}
