package csc142_spr17;

public class extendThrees {
	public static void main(String[] args) {
		int[] sample = {10, 3, 2, 4, 21, 5};
		System.out.println(extendThrees(sample));
		System.out.println(0 % 3);
	}

	public static int[] extendThrees(int[] a) {
		int[] counter = new int[a.length];
		int j = 0;
		int i = 0;
		for(int temp = 0; temp < counter.length; temp++){
			if(a[temp] % 3 == 0){
				System.out.println("true");
				j = a[temp];
				System.out.println(j);
				counter[temp] = j;
			} else if (a[temp] % 3 != 0 || a[temp] != 0){
				j = a[temp];
				System.out.println("blank");
			} else if (a[temp] == 0){
				System.out.println("zero");
				j = a[temp];
				System.out.println(j);
				counter[temp] = j;
		} 
			else if (j == 0){
				j = 0;
				counter[temp] = j;
			}
		}
		return counter;
	}
}
