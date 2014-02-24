import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EchoClient {
	
	public static void main(String[] args) {
		EchoClient aEchoClient = new EchoClient();
		aEchoClient.launch();
	}

	public void launch() {
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/Echo");
			EchoService echoService = (EchoService) service;
			
			String message = "I've replied!";
			System.out.println("Sending " + message + " to server.");
			String receivedEcho = echoService.echo(message);
			System.out.println("The server has replied with " + receivedEcho);

			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   		Date receivedDate = echoService.getDate();

	   		System.out.println("The server has replied with " + receivedDate + " Woop!");



		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}	
	}
}
