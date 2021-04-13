package BasicJava;

public class DogMain {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		
		// Create an instance (a copy) of the Dog class 
		Dog dgDog1 = new Dog();
		
		// Add values for the first dog
		dgDog1.setName("Rex");
		dgDog1.setBreed("Poodle");
		dgDog1.setColour("Brown");
		dgDog1.setAge(5);
		dgDog1.setHasHome(true);
	
		
//		// Read values for Dog 1 and output to the console
//		System.out.println("Dog 1 name : " + dgDog1.getName());
//		System.out.println("Dog 1 breed : " + dgDog1.getBreed());
//		System.out.println("Dog 1 colour : " + dgDog1.getColour());
//		System.out.println("Dog 1 age : " + dgDog1.getAge());
//		System.out.println("Dog 1 has home? : " + dgDog1.getHasHome());
//		
		
		// Create and instance of the Dog class for the second dog
		Dog dgDog2 = new Dog();
		
		// Add values for the second dog
		dgDog2.setName("Woof");
		dgDog2.setBreed("Bulldog");
		dgDog2.setColour("Black");
		dgDog2.setAge(2);
		dgDog2.setHasHome(false);
		
		
		// output Dog1 values to console
		dgDog1.outputToConsole();
		// output Dog2 value to console
		dgDog2.outputToConsole();
		
	}

}
