import java.util.*;

public class HashUtilities {
	public static void main(String[]args) {
		System.out.println("Give me a String and I will calculate it's hash code.");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}

	
	public static int shortHash(int hashCode) {
		return Math.abs(hashCode % 1000);
	}
} 