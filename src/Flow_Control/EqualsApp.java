package Flow_Control;

public class EqualsApp {

	public static void main(String[] args) {
		
		String o1 = "java";
		String o2 = new String("java");
		String o3 = "java";
		
		System.out.println(o1 == o2);	// false
		System.out.println(o1 == o3);	// true
		
		

	}

}
