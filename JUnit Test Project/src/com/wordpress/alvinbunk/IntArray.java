package com.wordpress.alvinbunk;

public class IntArray {
	private int[] arrayInt;
	private int counter;
	private boolean isEmpty;
	
	// The constructor.
	public IntArray(int size) {
		arrayInt = new int[size];
		// Initialize values.
		counter = -1;
		isEmpty = true;
	}
	
	// Add an item to array.
	public void add(int item) {
		counter++;
		arrayInt[counter] = item;
		
		// Array may have been empty.
		if(isEmpty == true)
			isEmpty = false;
	}
	
	// Remove last item from array.
	public void remove() {
		arrayInt[counter] = 0;
		counter--;
		
		// If counter is '-1', then array is empty.
		if(counter == -1)
			isEmpty = true;
	}
	
	// Get array size (zero based).
	public int size() {
		return counter;
	}
	
	// Is the array empty.
	public boolean isEmpty() {
		return isEmpty;
	}
	
	// Get the item at (zero based).
	public int get(int location) {
		return arrayInt[location];
	}
	
	// Check if array contains item.
	// If array is empty this fails.
	public boolean contains(int item) {
		// Declare false unless item exists.
		boolean results = false;
		for(int i=0; i<=counter; i++) {
			if(arrayInt[i] == item) {
				results = true;
			}
		}
		
		return results;
	}
}
