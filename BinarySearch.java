package general;

public class BinarySearch {
	/* It throws stack overflow exception when large number is used. */
	private static void repeat(Integer[] data, int target) {
		repeat(data, 0, data.length - 1, target);
	}

	private static void repeat(Integer[] data, int start, int end, int target) {
		int mid =  (start + end) % 2 !=0? ((start + end) / 2)+1:(start + end) / 2 ;

		if (data[mid] == target) {
			System.out.println(mid);
			return;
		} else if (target < data[mid]) {
			repeat(data, start, mid, target);
		} else {
			repeat(data, mid, end, target);
		}

	}

	public static void main(String[] args) {
		Integer[] data = { 1, 2, 4, 5, 6, 7, 8 };
		BinarySearch.repeat(data, 4);

	}

}
