package cleancoding;

public class Clean {

	public static boolean isSumDivisibleByVal(int sum, int val) {
		return sum % val == 0;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 8, 2, 5, 1, 9 };
		int[] divisors = new int[] { 3, 5 };
		int[] countOfDivisibleAdjPairs = new int[] { 0, 0 };
		for (int i = 0; i < nums.length - 1; i++) {
			int adjPairSum = nums[i] + nums[i + 1];
			for (int j = 0; j < divisors.length; j++) {
				if (isSumDivisibleByVal(adjPairSum, divisors[j]))
					countOfDivisibleAdjPairs[j]++;
			}
		}
		System.out.println(countOfDivisibleAdjPairs[0] + " " + countOfDivisibleAdjPairs[1]);
	}

}
