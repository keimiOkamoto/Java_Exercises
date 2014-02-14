import java.io.*;

public class FileNamePrint {

public static void main(String[] args) {
	File myFile = new File(".");
	String[] files; 

	files = myFile.list();

	for (String a : files){
	System.out.println(a);
	}

	}
}