package cleancoding;

public class Dirty {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 5, 8, 9, 12, 7 };
		int c1 = 0, c2 = 0; // Bad naming
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1) {
				if ((nums[i] + nums[i + 1]) % 3 == 0) { // multiple levels of indentation
					c1++;
				}
				if ((nums[i] + nums[i + 1]) % 5 == 0) { // no modularity, violates DRY
					c2++;
				}
			}
		}
		System.out.print(c1 + " " + c2);
	}

}
