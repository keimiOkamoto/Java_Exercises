import java.util.*;

public class MobilePhone extends OldPhone {
	private LinkedList<String> lastDialed = new LinkedList<>();
	public static int count = 0;
	
	public MobilePhone() {
		System.out.println("Super Mobile phone being called ");
	}

	public MobilePhone(String aBrand) {
		super(aBrand);
	}

	public void ringAlarm(String alarm) {
		System.out.println("Ringing...");
	}

	//This is set to private but it must be available from Smart phone!
	private void playGame(String game) {
		System.out.println("Playing " + game + "!");
	}

	private String returnGame(String game) {
		return game;
	}

	private void saveLastNumbers(String number) {
		if (count != 10) {
			lastDialed.add(number);
			count++;
		} else {
			lastDialed.remove();
			count--;
		}
	}

	public void printLastNumbers() {
		System.out.println("printLastNumber " + lastDialed);
	}	

	public void call(String number) {
		super.call(number);
		saveLastNumbers(number);
	}

}