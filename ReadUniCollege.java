import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ReadUniCollege {
	private FileInputStream fileinput; 
	private ObjectInputStream objectinput; 
	
	public ReadUniCollege()throws IOException
	{
		fileinput=new FileInputStream("/Users/tableau/CollegeANDUni");
		objectinput=new ObjectInputStream(fileinput);
	}
	
	public void readunicollege()throws IOException
	{
		try
		{
		University e=(University)objectinput.readObject();
		System.out.println("College Code " + e.getCollegecode());
		System.out.println("College name " + e.getCollegename());
		System.out.println("City " + e.getCity());
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("not able to find the class!");
		}
	}
		
}
