/**
* Day 17 (Concurrency pt.1) exercise 7.1 - 'Self ordering list'
* 
*Class ListContainer that holds the list made. Here nodes are added.
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

public class ListContainer {
	/**
	* Main method to create the list
	*/
	public static void main (String[] args ) {
		IntegerList aList = new IntegerList();
		aList.add(new Integer(21));
		aList.add(new Integer(42));
		aList.add(new Integer(33));
		aList.add(new Integer(3));
		aList.add(new Integer(53));
		aList.add(new Integer(323));
		aList.print();

		//Thread t1 = new Thread(new IntegerList());
		//t1.start();
	}
}