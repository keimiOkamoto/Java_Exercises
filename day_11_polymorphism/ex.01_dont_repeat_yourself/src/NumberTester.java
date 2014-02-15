public class NumberTester{
	public static void main (String[]args) {
		Comparator aComp = new Comparator();
		System.out.println(aComp.getMax("1.1", "2.2"));
		System.out.println(aComp.getMax(3.3, 4.4));
		System.out.println(aComp.getMax(5, 6));
	}
}	