package IMP;

import java.util.Arrays;

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 3, 2, 5, 4, 6, 5, 7, 5 , 6, 7};
		boolean[] track = new boolean[arr.length];

		System.out.println(Arrays.toString(arr));

		for (int i = 0, cnt = 1; i < arr.length-1; i++, cnt = 1) {
			if (track[i])
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
					track[j] = true;
				}

				
			}
			if (cnt > 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
