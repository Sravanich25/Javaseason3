package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("D:\\Assignment\\Mar21th.txt"); //reference will be created
		f1.createNewFile(); //to create file we use this method
		System.out.println("end of program");
		
	}

}
