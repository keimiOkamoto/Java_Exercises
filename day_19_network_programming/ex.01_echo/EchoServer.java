/**
* Day 19 (Network programming) exercise 01 - 'echo'
* Day 19 (Network programming) exercise 02 - 'date'
* EchoServer is the server object
*/

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class EchoServer extends UnicastRemoteObject implements EchoService {

	public EchoServer() throws RemoteException {
	}

	@Override
	public String echo(String s) {
		System.out.println("Server here, i'm going to send some " + s + "'.");
		s = s + " xxxx";
		return s;
	}

	@Override
	public Date getDate() {
		Calendar cal = Calendar.getInstance();
	   	return cal.getTime();
	}
}
	