package IMP;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 1, 0, 8, 9, 4, 6, 5 };

		int min1 = Integer.MAX_VALUE;
		int min2 = 0;

		for (int ele : arr) {
			if (min1 > ele) {
				min2 = min1;
				min1 = ele;
			} else if (min1 < ele && ele < min2) {
				min2 = ele;
			}
		}

		System.out.println("Second Smallest Element in an Array : " + min2);
	}

}
