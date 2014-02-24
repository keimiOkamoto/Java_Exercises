/**
* Day 19 (Network programming) exercise 01 - 'echo'
* Day 19 (Network programming) exercise 02 - 'date'
* EchoServerLauncher
*/

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.net.MalformedURLException;
import java.util.*;

public class EchoServerLauncher {
	public static void main(String [] args) {
		EchoServerLauncher a = new EchoServerLauncher();
		a.launch();
	}
	private void launch() {
		// 1. If ther is no security manager start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			// 2. Create the registery if there is not one
			LocateRegistry.createRegistry(1099);
			// 3. Create the server object
			EchoServer server = new EchoServer(); 
			// 4. Register (bind) the server object on the registry
			// The registry may be on a different machine
			String registryHost = "//127.0.0.1/";
			String serviceName = "Echo";
			Naming.rebind(registryHost + serviceName, server);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}