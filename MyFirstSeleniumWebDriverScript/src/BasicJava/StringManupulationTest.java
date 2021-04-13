package BasicJava;

public class StringManupulationTest {

	public static void main(String[] args) {
		
//		String h = "hello world";
//		System.out.println(h.charAt(4));	//OUTPUT: o
		
		String str = "12/2023";
		System.out.println("string length is: "+str.length());
		System.out.println(str.substring(str.length()-4));
		System.out.println(str.substring(0, 2));
	
//		switch (str) {
//		case "January":
//			System.out.println(str.substring(0, 2));
//			str = str.substring(0, 2);
//			break;
//			
//			}
//		System.out.println("Month: "+ str);
	}
}