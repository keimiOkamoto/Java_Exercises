/**
* Day 10 (Polymorphism) exercise 01 - 'Don't repeat yourself'
*
* There is a lot of repeating code her one way  of making thimgs better is useing method overloading
*/

public class Comparator {
	//<> used on the method because it is a static .
	//If it is not a static it must be specified in the class. 
	public static <T extends Comparable> T getMax(T type1, T type2)  {
		if (type1.getClass() != type2.getClass()) {
			System.out.println("Incompatible types, please try again");
            			return type1;
        		} else if (type1.compareTo(type2) > 0){
            			return type1;
        		} else{
            			return type2;
        		}
    	}

    	public static void main (String[]args) {
    		Comparator a = new Comparator();
    		System.out.println(a.getMax("23", "50"));
    	}
}
/**
* Below is another way do the above, although the ablove is a cleaner
* and uses generics.
*/

/*
public class Comparator {
	//Method takes in a int
	public double getMax (int n, int m) {
		double d1 = (double)n;
		double d2 = (double)m;
		return getMax(d1, d2);
	}
	//Method takes in a String
	public double getMax (String number1, String number2) {
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		return getMax(n1,n2);
	}
	//Method takes in a double and returns whichever is larger
	public double getMax (double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
}
*/
