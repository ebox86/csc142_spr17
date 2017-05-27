package csc142_spr17;

public class getCountEvens {
	public static void main(String[] args) {
		int[] sample = {3, 2, 4, 5, 8};
		System.out.println(getCountEvens(sample, 2));
	}

	public static int[] getCountEvens(int[] nums, int count) {
		int[] counter = new int[count];
		int j = 0;
		int i = 0;
		while (j < count) {
			System.out.println(j + "=j "+ counter.length + "=length");
			System.out.println(count + "count");
			System.out.println(i + "=i");
			if (nums[i] % 2 == 0) {
				counter[j] = nums[i];
				j++;
				System.out.println(j);
			}
			i++;
		}
		return counter;
	}
}
