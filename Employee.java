//Step - 1 (Employee Class - Serializable)
//Step - 2 (WriteData.java)
//Step - 3 (ReadData.java)

import java.io.*;
public class Employee implements Serializable{  // Read file > change Object to Byte string > Transfer byte code to between JVMS and de-serialize! 
	//First create the Ojbect class 
	private int empid;
	private String empname;
	private double salary;
	// Getter - Setter
	// Right clcim -> Source > Generate Getters and Setters// All of the following will be right automatically
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
