package IMP;

public class SecondLargest {
	public static void main(String[] args) {

		int[] arr = {78,2, 7, 3, 1, 8, 9, 4, 6, 5 ,11,68};
		int max1= Integer.MIN_VALUE;
		int max2 = 0;
		for (int ele : arr) {
			if (max1 < ele) {
				max2 = max1;
				max1 = ele;
			}else if(ele < max1 && ele > max2)
			{
				max2 = ele;
			}
		}
		System.out.println("Largest Number in the array is : " + max2);

	}

}
