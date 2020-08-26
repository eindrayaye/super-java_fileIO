//package FileIOExamp;

import java.util.*;
import java.io.*; 
public class WriteUniCollege {
	private Scanner sc;
	private FileOutputStream collegeoutput; 
	private ObjectOutputStream collegeooutput;
	private FileWriter writers;
	private int univCode;
	private String univName;
	
	public WriteUniCollege()throws FileNotFoundException, IOException
	{
		writers=new FileWriter("/Users/tableau/CollegeANDUni",true);
		sc=new Scanner(System.in); // set up scanner		
		collegeoutput=new FileOutputStream ("/Users/tableau/CollegeANDUni"); // Set the file path to (1) Open (2) Write 
		collegeooutput=new ObjectOutputStream(collegeoutput); // Set the Object path
	}
	
	public void uniCollegeData()throws IOException
	{
		University e=new University();
		System.out.println("Enter College Code in (number):  ");
		e.setCollegecode(sc.nextInt());
		System.out.println("Enter name of the College: ");
		e.setCollegename(sc.next());
		System.out.println("Enter City: ");
		e.setCity(sc.next());
		collegeooutput.writeObject(e);
		System.out.println("<<College data wrote in file - CollegeANDUni.txt>>");
	}
	
	public void onlyWriteUniData()throws IOException
	{
		System.out.println("Enter University Code (in Number): ");
		univCode=sc.nextInt();
		System.out.println("Enter University Name: ");
		univName=sc.next();
		writers.write(String.valueOf(univCode));
		writers.write(univName);
		writers.flush();
		System.out.println("<<University data wrote in file - CollegeANDUni.txt>>");
	}
	
	public void writeLastLine()
	{
		System.out.println("Completed data collecting for both University and College!!");
	}
	
	public static void main(String args[])
	{
		try{
			
		
		WriteUniCollege w=new WriteUniCollege();
		w.uniCollegeData();
		System.out.println();
		w.onlyWriteUniData();
		System.out.println();
		System.out.println("***********");
		System.out.println("Data Reading/ Disply only College");
		System.out.println("***********");
		ReadUniCollege unc=new ReadUniCollege();
		unc.readunicollege();
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

