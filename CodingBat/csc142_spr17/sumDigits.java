package csc142_spr17;

public class sumDigits {
	public static void main(String[] args){
		System.out.println(sumDigits("aa1bc2d3"));
		System.out.println(sumDigits("aa11b33"));
		System.out.println(sumDigits("12345"));
	}
	
	public static int sumDigits(String s) {
		  int sum = 0;
		  for (char c : s.toCharArray()) if (Character.isDigit(c)) sum+=Character.getNumericValue(c);
		  return sum;
		}
}
