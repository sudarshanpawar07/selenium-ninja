package IMP;

public class FirstSmallest {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 1, 0, -123, 8, 9, 4, 6, 5 };

		int min = Integer.MAX_VALUE;

		for (int ele : arr) {
			if (min > ele) {
				min = ele;
			}
		}

		System.out.println("Smallest Element in an Array : " + min);
	}

}
