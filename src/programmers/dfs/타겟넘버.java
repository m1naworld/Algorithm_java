package programmers.dfs;

public class 타겟넘버 {

	public static int solution(int[] numbers, int target) {
		return getWaysToTarget(numbers, target, 0, 0);
	}

	private static int getWaysToTarget(int[] numbers, int target, int sum, int index) {

		if (index == numbers.length) {
			return sum == target ? 1:0;
		}

		int ways = 0;
		ways += getWaysToTarget(numbers, target, sum + numbers[index], index + 1);
		ways += getWaysToTarget(numbers, target, sum - numbers[index], index + 1);
		return ways;
	}

	public static void main(String[] args) {
		int[] a = {1, 1, 1, 1, 1};
		solution(a, 3);

		int[] b = {4, 1, 2, 1};
		solution(b, 4);
	}
}

/*
getWaysToTarget(b, 4, 0, 0);
0 + getWaysToTarget(b, 4, 4, 1); + getWaysToTarget(b, 4, -4 , 1);
	 = getWaysToTarget(b, 4, 5, 2) + getWaysToTarget(b, 4, 3, 2) + getWaysToTarget(b, 4, -3, 2) +  getWaysToTarget(b, 4, -5, 2);
	 = getWaysToTarget(b, 4, 7, 3) +  getWaysToTarget(b, 4, 3, 3) +  getWaysToTarget(b, 4, 5, 3) +  getWaysToTarget(b, 4, 1, 3) + getWaysToTarget(b, 4, -1, 3) +  getWaysToTarget(b, 4, -5, 3) +  getWaysToTarget(b, 4, -3, 3) +  getWaysToTarget(b, 4, -7, 3)
	 = getWaysToTarget(b, 4, 8, 4) + getWaysToTarget(b, 4, 6, 4) + getWaysToTarget(b, 4, 4, 4) + getWaysToTarget(b, 4, 2, 4) + getWaysToTarget(b, 4, 6, 4) + getWaysToTarget(b, 4, 4, 4) + getWaysToTarget(b, 4, 2, 4) + getWaysToTarget(b, 4, 0, 4) + getWaysToTarget(b, 4, 0, 4) + getWaysToTarget(b, 4, 2, 4)
		+ getWaysToTarget(b, 4, -4, 4) + getWaysToTarget(b, 4, -6, 4) + getWaysToTarget(b, 4, -2, 4) + getWaysToTarget(b, 4, -4, 4) + getWaysToTarget(b, 4, -8, 4) + getWaysToTarget(b, 4, -6, 4)
*/
