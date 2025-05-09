package filehandling;

import java.io.File;
import java.io.IOException;

public class FolderDemo1 {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("D:\\Assignment\\report"); //reference will be created
		f1.mkdirs(); //to create folder we use this method
		System.out.println("end of program");
		
	}

}
