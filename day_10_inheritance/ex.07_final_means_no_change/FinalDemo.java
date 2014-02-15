public class FinalDemo extends String {

	final static void printEven(String word) {
		for (int x = 0; x <= word.length(); x++) {
			if (x/2 == 0) {
				System.out.println(charAt(x));
			}		
		}
	}

	public static void main (String[]args) {
		FinalDemo a = new FinalDemo("Hello");
	}	
}