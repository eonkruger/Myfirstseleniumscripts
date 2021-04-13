package BasicJava;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create the first student instance
		Student stud1 = new Student();
		
		// Add Values for the first student 
		stud1.setName("Sastri");
		stud1.setAge(20);
		stud1.setMajorSubject("Computer Science");
		stud1.setYearsCompleted(1);

		// Create the second student instance
		Student stud2 = new Student();
		
		// Add Values for second student
		stud2.setName("Lance");
		stud2.setAge(30);
		stud2.setMajorSubject("Cricket");
		stud2.setYearsCompleted(5);
		
		// output student 1 values to console
		stud1.outputToConsole();
		
		// output student 2 values to console
		stud2.outputToConsole();
		
	}

}
