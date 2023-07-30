package cleancoding;

public class CleanFunction {

	public static void printPair(int x, int y) {
		System.out.println(x + " is co-prime with " + y);
	}

	public static boolean isParitySame(int x, int y) {
		return ((x & 1) ^ (y & 1)) == 0;
	}

	public static int getGCD(int x, int y) {
		int maximum = Math.max(x, y), minimum = Math.min(x, y);
		while (maximum % minimum != 0) {
			int temp = minimum;
			minimum = maximum % minimum;
			maximum = temp;
		}
		return minimum;
	}

	public static boolean areCoPrimes(int x, int y) {
		return getGCD(x, y) == 1;
	}

	public static void changeElementsToAbsoluteVal(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.abs(nums[i]);
		}
	}

	public static void printAdjacentCoPrimePairsWithSameParity(int[] nums, boolean changeToAbsoluteVal) {
		if (changeToAbsoluteVal) {
			changeElementsToAbsoluteVal(nums);
		}

		for (int i = 0; i < nums.length - 1; i++) {
			boolean isAdjacentPairCoPrime = areCoPrimes(nums[i], nums[i + 1]);
			if (isAdjacentPairCoPrime && isParitySame(nums[i], nums[i + 1])) {
				printPair(nums[i], nums[i + 1]);
			}
		}
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 8, 3, 47, 9 };
		printAdjacentCoPrimePairsWithSameParity(nums, true);
	}

}
