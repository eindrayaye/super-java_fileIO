//Sample how to create file in your system

import java.io.*;
public class FileCreateDemo {
	private File createDemo1;
	
	public FileCreateDemo ()
	{
		createDemo1 = new File("/Users/Java/IOFile.txt"); // This is path format for Mac
		//("/Users/pavankumar/Desktop/Testing/Java.txt");
	}
	
    public void listStop()
    {
    	
    	boolean reserve = createDemo1.mkdir();// mkdir <-- is creating Directory!
    	if (reserve)
    	{
    	 System.out.println("Folder Created");
    	}else {
    		System.out.println("Can't create folder"); // If file already exist, will get the same message !!
    	}
    }
    
    public static void main(String args[])
    {
    	FileCreateDemo f=new FileCreateDemo();
    	f.listStop();
    }
}
