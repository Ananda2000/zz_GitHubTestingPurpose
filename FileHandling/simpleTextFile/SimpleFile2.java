package simpleTextFile;

import java.io.File;

public class SimpleFile2 
{
	public static void main(String [] args)
	{
		File fle = new File("D:\\FileHandlingPRactice\\kumar.txt");
		
		System.out.println("CAN EXECUTE THE FILE---"+fle.canExecute());
		
		System.out.println("Can read the file ---"+fle.canRead());
		
		System.out.println("get the file name -- "+fle.getName());
	}

}
