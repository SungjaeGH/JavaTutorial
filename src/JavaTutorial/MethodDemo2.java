// method 입력값 제어
package JavaTutorial;

public class MethodDemo2 {
	public static void numbering(int init, int limit) {
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(3, 5);

	}

}
