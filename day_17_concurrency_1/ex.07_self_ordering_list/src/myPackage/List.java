/**
* Day 17 (Concurrency pt.1) exercise 7.1 - 'Self ordering list'
* 
*Interface for a Linkied list.
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

public interface List {
/**
* adds new integer to list
*/
void add(Integer aNumber);

/**
* takes  a reference ID and returns the Integer
*/
Integer get(int positionRef);

}