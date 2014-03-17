/**
* Day 17 (Concurrency pt.1) exercise 7.1 - 'Self ordering list'
* 
* Class Node that holds an Integer value.
*
* A program that implements a sorted list, nodes are added with an Integer value
* and sorted from small to large. New nodes are added to the endo of the list. 
*
* 
* 1 first thread must add at the end of the list then flag as "Not sored" and return
* 2 second thread must be constantly checking if it is. if  it isnt sorted  it must sort
* them flag "sorted".
* 3 if get() is called and the list is not sorted it must wait until the list is fuly sorted. 
* No additional add() can be called until the get() has returned a value. 
*/
package myPackage;

public class Node {
	private static int count;
	private Node next = null;
	private Integer aInteger;
	private int id;

	/**
	* constructor sets Integer and ID number
	* @param aInteger number 
	*/
	public Node(Integer aInteger) {
		this.aInteger = aInteger;
		this.id = count++;
	}

	/**
	* Gets the next node.
	* @return the next node
	*/
	public Node getNext() {
		return next;
	}

	/**
	* Gets the ID of the node
	* @return ID of the node
	*/
	public int getId() {
		return id;
	}

	/**
	* Gets the integer value	
	* @return Integer value 
	*/
	public Integer getInteger() {
		return aInteger;
	}

	/**
	* Sets the next node to a newNode
	* @param newNode replaces next
	*/
	public void setNext(Node newNode) {
		next = newNode;
	}

	/**
	* @return 
	*/
	@Override
	public String toString() {

		if (this.next == null) {
			return "" + this.getInteger();
		} else {
			return "" + this.getInteger() + ", "+ getNext();
		}
	}
}