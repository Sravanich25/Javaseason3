package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
	
		//if we want to create a file in project we need to use System.getProperty("user.dir") and the file name
		File f1 = new File(System.getProperty("user.dir")+"\\Mar21th.txt"); //reference will be created
		System.out.println(f1.createNewFile()); //to create file we use this method
		System.out.println("end of program");
		
	}

}
