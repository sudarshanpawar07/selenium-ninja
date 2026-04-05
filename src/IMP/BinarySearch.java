package IMP;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 18, 36, 45, 50, 60, 70 };
		int high = arr.length - 1, low = 0;
		int key = 15;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (arr[mid] == key) {
				System.out.println("Element found at " + mid + " index.");
				return;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}

}
