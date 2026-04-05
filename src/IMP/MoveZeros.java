package IMP;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int [] arr = {1,2,0, 0, 9, 6, 0, 8};
		int k = 0;
		System.out.println(Arrays.toString(arr));
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				arr[k] = arr[i];
				k++;
			}
		}
		for(int i = k; i<arr.length;i++)
		{
			arr[i] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
