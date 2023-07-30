package cleancoding;

public class DirtyFunction {

	public static void printAdjacentCoPrimePairsWithSameParity(int[] nums, boolean changeToAbsoluteVal) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (changeToAbsoluteVal) {
				nums[i] = Math.abs(nums[i]);
				nums[i + 1] = Math.abs(nums[i + 1]);
			}
			int maxm = Math.max(nums[i], nums[i + 1]), minm = Math.min(nums[i], nums[i + 1]);
			while (maxm % minm != 0) {
				int temp = minm;
				minm = maxm % minm;
				maxm = temp;
			}
			if (minm == 1) {
				if (((nums[i] & 1) ^ (nums[i + 1] & 1)) == 0)
					System.out.println(nums[i] + " " + nums[i + 1]);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 8, 1, 9, 4, 2 };
		printAdjacentCoPrimePairsWithSameParity(nums, true);

	}

}
