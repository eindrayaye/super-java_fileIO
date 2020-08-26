//Step - 2 (WriteData.java)

//Check Classes as below:
//Step - 1 (Employee Class - Serializable)
//Step - 3 (ReadData.java)

import java.util.*;// Scanner and other util need this
import java.io.*; // File in and out need this 
public class WriteData {
	private Scanner sc; 
	private FileOutputStream output; // FileOutputStream is a Keyword for Open file for writing
	private ObjectOutputStream ooutput; // To write data in an Object files
	
	public WriteData()throws FileNotFoundException, IOException
	{
		sc=new Scanner(System.in); // set up scanner
		
		output=new FileOutputStream ("/Users/tableau/access_doc"); // Set the file path to (1) Open (2) Write 
		ooutput=new ObjectOutputStream(output); // Set the Object path
	}
//Write data in file <-- Always need Exception FielNotFounr and IOException
	
	public void storeData()throws IOException
	{
		Employee e=new Employee();
		System.out.println("Enter employee id ");
		e.setEmpid(sc.nextInt());
		System.out.println("Enter employee name");
		e.setEmpname(sc.next());
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		ooutput.writeObject(e);
		System.out.println("Data written");
	}
	public static void main(String args[])
	{
		try{
			
		
		WriteData w=new WriteData();
		w.storeData();
		System.out.println("Data Reading");
		ReadData d=new ReadData();
		d.readinfo();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			
			System.out.println("message is "+e.getMessage());
		}
		
	}
		
	
}
