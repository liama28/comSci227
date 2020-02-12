package lab3;

public class personTest {

	public static void main(String[] args) {
		
		Person a = new Person("Liam", 19);
		
		System.out.println(a.getAge()); // 0
		System.out.println(a.getName()); // null
		System.out.println(a.getNameLength()); // Exception in thread "main" java.lang.NullPointerException
		
		
		
		
		
		
	}
	
}
