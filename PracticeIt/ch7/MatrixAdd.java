package ch7;

public class MatrixAdd {

	public static void main(String[] args){
		int [][] input1 = {{1, 2, 3}, {4, 4, 4}};
		int [][] input2 = {{5, 5, 6}, {0, -1, 2}};
		int [][] result = matrixAdd(input1, input2);
		for(int[] n : result){
			for(int b :n){
				System.out.print(b + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static int[][] matrixAdd(int[][] a, int[][] b){
		if(a.length != 0 && b.length != 0){
			int[][] c = new int[a.length][a[0].length];
			for(int i = 0; i < a.length; i++){
				 for(int j = 0; j < a[0].length; j++){
					 c[i][j] = a[i][j] + b[i][j];
				 }
			}
			return c;
		} else {
			int[][] c = new int[0][0];
			return c;
		}
	}
}
