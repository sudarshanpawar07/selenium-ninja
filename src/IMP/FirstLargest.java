package IMP;

public class FirstLargest {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 1, 8, 9, 4, 6, 5 };
		int max = Integer.MIN_VALUE;
		for (int ele : arr) {
			if (max < ele) {
				max = ele;
			}
		}
		System.out.println("Largest Number in the array is : " + max);

	}

}
