package csc142_spr17;

import java.util.ArrayList;

public class LoopTableConstant {
	public static void main(String[] args){
		ArrayList<Integer> testList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) testList.add(i);
		System.out.println(testList.size());
		System.out.println(testList.get(0));
		int SIZE = 9;
		for(int line = 1; line <= 6; line++){
			//System.out.println(-1 * line + (2 * SIZE + 3));
		}
	}
}
