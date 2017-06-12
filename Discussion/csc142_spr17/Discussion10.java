package csc142_spr17;

import java.util.ArrayList;

public class Discussion10 {
	public static void main(String[] args){
		ArrayList<CSC142Point> testArr = new ArrayList<CSC142Point>();
		CSC142Point p1 = new CSC142Point(0, 1), p2 = new CSC142Point(5, 1), p3 = new CSC142Point(2, 1), p4 = new CSC142Point(0, 0);
		testArr.add(p1);
		testArr.add(p2);
		testArr.add(p3);
		testArr.add(p4);
		System.out.println(onlyX(testArr));
	}
	
	public static double which(double x,int y) {
		if (x < 0) throw new IllegalArgumentException();
		if (y == 0) return 1;
		if (x == 0 || x == 1) return x;
		if (y == 1) return x;
		if (y < 0) return 1 / which(x, -y);
		double z = which(x, y/2);
		if (y %2 == 0) return z * z; else return z * z * x;
		}
	
	public static ArrayList<CSC142Point> onlyX (ArrayList<CSC142Point> inputArr){
		ArrayList<CSC142Point> newList = new ArrayList<CSC142Point>();
		for(CSC142Point p : inputArr) if(p.getX() == 0) newList.add(p);
		return newList;
	}
}

