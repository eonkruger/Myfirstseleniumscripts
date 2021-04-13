package BasicJava;

public class Dog {
	// Add private variables to store a dog's attributes. Private variables cannot be accessed directly outside of this class
	private String sName;
	private String sBreed;
	private String sColour;
	private int iAge;
	private boolean bHasHome;
	
	
	// Create a method to set the value for sName
	public void setName(String pName) {
		// Set this (which refers to this class) .sNane to the pName value
		this.sName = pName;
	}
	
	// Create a method to get the value for sName
	public String getName() {
		// Send this.sName value out of this method using the return keyword
		return this.sName;
	}
	
	// Setter for sBreed
	public void setBreed(String pBreed) {
		this.sBreed = pBreed;
	}
	
	// Getter for sBreed
	public String getBreed() {
		return this.sBreed;
	}
	
	// Setter for Colour
	public void setColour(String pColour) {
		this.sColour = pColour;
	}
	
	// Getter for Colour
	public String getColour() {
		return this.sColour;
	}
	
	// Setter for the Age
	public void setAge(int pAge) {
		this.iAge = pAge;
	}
	
	// Getter for the Age
	public int getAge() {
		return this.iAge;
	}
	
	// Setter for Has Home
	public void setHasHome(boolean pHasHome) {
		this.bHasHome = pHasHome;
	}
	
	// Getter for Has Home 
	public boolean getHasHome() {
		return this.bHasHome;
	}

	// Create a method to output all values to the console
	public void outputToConsole() {
		// Read values for Dog  and output to the console
		System.out.println("--------------------------------------------");
		System.out.println("Dog name : " + this.getName());
		System.out.println("Dog breed : " + this.getBreed());
		System.out.println("Dog colour : " + this.getColour());
		System.out.println("Dog age : " + this.getAge());
		System.out.println("Dog has home? : " + this.getHasHome());
		
		
	}
}
