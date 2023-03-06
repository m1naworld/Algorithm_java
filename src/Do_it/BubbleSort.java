package Do_it;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int n = 5;
		int[] arr = new int[] {42, 32, 24, 60, 15};

		for (int i = 0; i < n -1; i++) {
			System.out.println("i = " + i);

			for(int j=0; j < n - i -1; j++) {

				System.out.println("j = " + j);

				if (arr[j] > arr[j + 1]) {
					int left = arr[j];
					int right = arr[j + 1];

					arr[j] = right;
					arr[j + 1] = left;
				}
				Arrays.stream(arr).forEach(a -> System.out.println(a));
			}
		}
	}
}
