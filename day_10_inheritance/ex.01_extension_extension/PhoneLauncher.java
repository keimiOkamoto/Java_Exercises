import java.util.*;

public class PhoneLauncher{
	public static void main(String[]args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone aSmartPhone = new SmartPhone("iPhone");
		/*
		aSmartPhone.call("0208-222-0001");
		aSmartPhone.call("0208-222-0002");
		aSmartPhone.call("0208-222-0003");
		aSmartPhone.call("0208-222-0004");
		aSmartPhone.call("0208-222-0005");
		aSmartPhone.call("0208-222-0006");
		aSmartPhone.call("0208-222-0007");
		aSmartPhone.call("0208-222-0008");
		aSmartPhone.call("0208-222-0009");
		aSmartPhone.call("0208-222-0010");
		aSmartPhone.call("0208-222-0011");
		aSmartPhone.call("0208-222-0012");
		aSmartPhone.printLastNumbers();
		System.out.println();
		*/
		aSmartPhone.ringAlarm("ring ring...");
		aSmartPhone.playGame("Tetris");
		System.out.println();

		System.out.println(aSmartPhone.findPosition());
		System.out.println();

		aSmartPhone.call("0008-222-0099");
		aSmartPhone.call("0008-222-0098");
		
		aSmartPhone.call("0208-222-0013");
		aSmartPhone.printLastNumbers();

		System.out.println(aSmartPhone.getBrand());
		System.out.println();

		/*
		Casting Test but didn't work
		MobilePhone aMobilePhone = (MobilePhone)aSmartPhone;
		MobilePhone a = new MobilePhone("some phone");
		
		*/

	}
}