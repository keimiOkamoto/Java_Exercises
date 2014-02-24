/**
* Day 19 (Network programming) exercise 01 - 'echo'
* Day 19 (Network programming) exercise 02 - 'date'
* EchoService inteface
*/

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface EchoService extends Remote {
	/**
	* Returns the same string passed as parameter
	* @param s a stirng
	* @return the same string passed as parameter
	*/
	public String echo(String aString) throws RemoteException;

	public Date getDate() throws RemoteException;
}