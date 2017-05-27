package csc142_spr17;

public class triangular {
	public static void main(String[] args){
		triangular(4);
	}
	public static int[] triangular(int n) {
		  int[] arr = new int[n*(n+1)/2];
		  int x = 0;
		  for(int i = 1; i <= n; i++ ){
			System.out.println("i="+i);
		    for(int j = 1; j <= i; j++){
		      arr[x] = j;
		      System.out.println("j="+j);
		      System.out.println("x="+x);
		      x++;
		      
		    }
		  }
		  for(int b: arr){
			  System.out.println(b);
		  }
		  return arr;
		}
}
