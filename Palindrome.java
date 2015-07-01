package general;

public class Palindrome {

	public static void palindrome(String data) {
		palindrome(data, 0, data.length() - 1);
	}

	public static void palindrome(String data, int start, int end) {

		if (data.charAt(start) == data.charAt(end)) {
			
			if (end - start <= 0) {
				System.out.println("Yes it is");
				return;
			}
			palindrome(data, start + 1, end - 1);
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {

		String data = "tata";
		Palindrome.palindrome(data);
	}
}
