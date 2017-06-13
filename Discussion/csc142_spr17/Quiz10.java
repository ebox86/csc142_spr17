package csc142_spr17;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Quiz10 {
	public static void main(String[] args){
		
		// questions 7 - 10
		System.out.println("++++++++\n"
				+ "questions 7 - 10\n");
		ArrayList<Point> plot = new ArrayList<Point>();
		Point p = new Point( 12, 16 );
		plot.add( p );
		plot.add( new Point( 0, 0 ) );
		plot.add( new Point( 4, 8 ) );
		plot.add( 2, new Point( 5, 10 ) );
		p = plot.get( 0 );
		p = plot.remove( 1 );
		plot.add( new Point( -5, 5 ) );
		System.out.println(plot.get(2));
	
		// question 11 - 14
		System.out.println("++++++++\n"
				+ "questions 11 - 14\n");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add( 12 );
		nums.add( 32 );
		nums.add( 15 );
		nums.add( 2, 11 );
		nums.add( 6 );
		int s = nums.size() ;
		System.out.println(s);
		int sum = 0;
		Iterator<Integer> it = nums.iterator();
		while( it.hasNext() ) {
		 int n = it.next();
		 if ( n % 2 == 1 )
		 sum = sum + n;
		}
		System.out.println(sum);
		nums.remove( 0 );
		System.out.println(nums.get(0));
		
		// question 17 - 20
		System.out.println("++++++++\n"
				+ "questions 17 - 20\n");
		HashMap<String, Point> places = new HashMap<String, Point>();
		places.put( "origin", new Point() );
		places.put( "east", new Point( 100, 0 ) );
		places.put( "south", new Point( 0, -100 ) );
		places.put( "northwest", new Point( -100, 100 ) );
		places.put( "east", new Point( 200, 0 ) );
		
		System.out.println(places.size());
		System.out.println(places.get("south"));
		System.out.println(places.get("east"));
		System.out.println(places.get("north"));
	}
	
}
