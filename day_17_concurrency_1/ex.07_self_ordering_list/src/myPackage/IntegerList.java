/**
* Day 17 (Concurrency pt.1) exercise 7.1 - 'Self ordering list'
* 
* Class List that creates Node and contains Nodes.
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

public class IntegerList implements List {
	Node firstNode = null;
	/**
	* Calls addNext() and creates a new node to be added.
	* @param aNumber Integer taken in for the newNode
	*/
	public void add(Integer aNumber) {
		Node newNode = new Node(aNumber);
		if (firstNode == null) {
			firstNode = newNode;
		} else {
			addNext(firstNode, newNode);
		}
	}
	/**
	* Recursivly searches for the end of the list and inserts the
	* new node to the end. The 'firstNode' is repaced by the 
	* nextNode everytime null is not found.
	* @param firstNode, newNode 
	*/
	private void addNext(Node firstNode, Node newNode) {
		if (firstNode.getNext() == null) {
			firstNode.setNext(newNode);
		} else {
			addNext(firstNode.getNext(), newNode);
		}
	}
	
	public Integer get(int positionref) {
		return firstNode.getId();
	}

	public void print() {
		printNext(firstNode);
	}

	private void printNext(Node firstNode) {
		if (firstNode == null) {
			return;
		} else {
			System.out.println("ID: " + firstNode.getId() + ", ");
			System.out.println("Integer: " + firstNode.getInteger() + ", ");
			printNext(firstNode.getNext());
		}

	}
}











