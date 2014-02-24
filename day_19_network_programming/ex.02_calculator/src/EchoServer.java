import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class EchoServer extends UnicastRemoteObject implements EchoService {

	public EchoServer() throws RemoteException {
	}

	@Override
	public String echo(String s) {
		System.out.println("Replied to some client saying '" + s + "'.");
		return s;
	}

	@Override
	public Date getDate() {
		Calendar cal = Calendar.getInstance();
	   	return cal.getTime();
	}
}
	