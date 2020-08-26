import java.io.*;
public class ReadData {
	private FileInputStream fileinput; // FileInputStream is a Keyword for input data in file
	private ObjectInputStream objectinput; // To write data in an Object files
	
	public ReadData()throws IOException
	{
		fileinput=new FileInputStream("/Users/tableau/access_doc");
		objectinput=new ObjectInputStream(fileinput);
	}
	
	public void readinfo()throws IOException
	{
		try
		{
		Employee e=(Employee)objectinput.readObject();
		System.out.println("Employee id " + e.getEmpid());
		System.out.println("Employee name " + e.getEmpname());
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("not able to find the class!");
		}
	}
		
}

