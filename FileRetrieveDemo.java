//Simple example, how to retrive file within your system

import java.io.*;
public class FileRetrieveDemo {
	
	public void FileRetrieveDemo() {
		File folder = new File("/Users/tableau");
		File [] files = folder.listFiles();
		for(File file: files)
			System.out.println(file.getName());
	}
	
	
	public static void main(String args[])
	{
		FileRetrieveDemo fle=new FileRetrieveDemo();
		fle.FileRetrieveDemo();
		
	}
}
