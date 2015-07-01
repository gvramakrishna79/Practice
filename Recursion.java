package general;

public class Recursion {
/*It throws stack overflow exception when large number is used.*/
	private static void repeat(int x) {
		if (x != 1) {
			System.out.println(x = x - 1);
			repeat(x);
		}
	}

	public static void main(String[] args) {

		Recursion.repeat(100);

	}

}
