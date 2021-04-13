//Exercise: Using the Dog class and the DogMain class as an example. Create a Student class and a StudentMain class. 
//The Student class must have private variables to store the name, age, major subject, years completed values. 
//The StudentMain class must have the main method and create 2 instances of Student for 2 different students and output the values to console

package BasicJava;

public class Student {
	// create private variables to store student details
	private String sName;
	private int iAge;
	private String sMajorSubject;
	private int iYearsCompleted;
	
	// Setter for sName
	public void setName(String pName) {
		this.sName = pName;
	}
	
	// Getter for sName
	public String getName() {
		return this.sName;
	}
	
	// Setter for Age
	public void setAge (int pAge) {
		this.iAge = pAge;
	}
	
	// Getter for Age
	public int getAge() {
		return this.iAge;
	}
	
	// Setter for Major Subject
	public void setMajorSubject(String pMajorSubject) {
		this.sMajorSubject = pMajorSubject;
	}
	
	// Getter for Major Subject
	public String getMajorSubject() {
		return this.sMajorSubject;
	}
	
	// Setter for Years Completed
	public void setYearsCompleted(int pYearsCompleted) {
		this.iYearsCompleted = pYearsCompleted;
	}
	
	// Getter for Years Completed 
	public int getYearsCompleted() {
		return this.iYearsCompleted;
	}
	
	// output values for student to the console
	public void outputToConsole() {
		// write values to console using the class methods
		System.out.println("-----------------------------------------------------------");
		System.out.println("Student name : " + this.getName());
		System.out.println("Student age : " + this.getAge());
		System.out.println("Student major subject : " + this.getMajorSubject());
		System.out.println("Student years completed : " + this.getYearsCompleted());
	}
	
}
