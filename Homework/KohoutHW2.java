/*
 * KohoutHW2 - drawing panel which displays a series of squares in a pattern
 *
 * Evan Kohout
 * 2017-04-14
 */

import java.awt.*;

public class KohoutHW2{
	
	public static final int square = 8;
	
	public static void main(String[] args){
		//part1();
		part2();
		
	}
	
	/** This is part 1 of the assignment which displays a picture created using vectors from the 
	 * awt and DrawingPanel graphics libraries.
	 * 
	 * No params, no return
	 */
	public static void part1(){
		DrawingPanel dp1 = new DrawingPanel( 400, 400);
		dp1.setBackground(Color.white);
		Graphics c1 = dp1.getGraphics();
		/** Rad yellow circle pattern for background **/
		for(int i = 0; i < 40; i++){
			int x1 = i * 10;
			for(int j = 0; j < 40; j++){
				int y1 = j * 10;
				c1.setColor(Color.yellow);
				c1.fillOval(x1, y1, 5, 5);
			}			
		}
		/** lower background color **/
		c1.setColor(Color.decode("0xD3D3D3"));
		c1.fillRect(40, 240, 330, 120); // gray lower background
		/** int arrays to hold the x and y coordinates for the polygons **/
		int[] xpointsC1 = new int[]{40, 45, 95, 55, 55, 115};
		int[] ypointsC1 = new int[]{30, 155, 130, 115, 65, 55};
		int[] xpointsS = new int[]{140, 140, 175, 165, 125, 165, 205, 160, 160, 190};
		int[] ypointsS = new int[]{40, 80, 125, 140, 130, 155, 125, 80, 60, 55};
		int[] xpointsC2 = new int[]{235, 245, 295, 255, 255, 305};
		int[] ypointsC2 = new int[]{40, 155, 140, 125, 65, 40};
		int[] xpointsR = new int[]{72, 102, 105, 75}; 
		int[] ypointsR = new int[]{308, 338, 335, 305};
		int[] xpointsR1 = new int[]{262, 265, 300, 298}; 
		int[] ypointsR1 = new int[]{292, 295, 265, 262};
		int[] xpointsR2 = new int[]{263, 266, 300, 297}; 
		int[] ypointsR2 = new int[]{308, 305, 335, 337};
		int[] xpointsBG = new int[]{10, 30, 320, 380};
		int[] ypointsBG = new int[]{10, 200, 220, 20};
		int[] xpointsBG2 = new int[]{15, 35, 325, 385};
		int[] ypointsBG2 = new int[]{15, 205, 225, 25};
		/** upper background colors **/
		c1.setColor(Color.black);
		c1.fillPolygon(xpointsBG2, ypointsBG2, 4); // black drop shadow
		c1.setColor(Color.decode("0x00FFCC")); // teal foreground background
		c1.fillPolygon(xpointsBG, ypointsBG, 4);
		/**Writes out the letters 'CSC' on the first line of the graphic **/
		c1.setColor(Color.MAGENTA);
		c1.fillPolygon(xpointsC1, ypointsC1, 6); // The first 'C'
		c1.fillPolygon(xpointsS, ypointsS, 10); // The 'S'
		c1.fillPolygon(xpointsC2, ypointsC2, 6); // The second 'C'
		/**Writes out the word 'Rocks' on the second line of the graphic with rectangles **/
		c1.setColor(Color.red);
		// The 'R' in 'Rocks'
		c1.fillRect(60, 260, 5, 40);
		c1.fillRect(60, 305, 5, 40);
		c1.fillRect(70, 260, 30, 5);
		c1.fillRect(105, 260, 5, 40);
		c1.fillRect(70, 295, 30, 5);
		c1.fillPolygon(xpointsR, ypointsR, 4);
		// The 'O' in 'Rocks'
		c1.fillRect(125, 260, 5, 40);
		c1.fillRect(125, 305, 5, 40);
		c1.fillRect(135, 260, 30, 5);
		c1.fillRect(170, 260, 5, 40);
		c1.fillRect(170, 305, 5, 40);
		c1.fillRect(135, 340, 30, 5);
		// The 'C' in 'Rocks'
		c1.fillRect(190, 260, 5, 40);
		c1.fillRect(190, 305, 5, 40);
		c1.fillRect(200, 260, 30, 5);
		c1.fillRect(200, 340, 30, 5);
		// the 'K' in 'Rocks'
		c1.fillRect(250, 260, 5, 40);
		c1.fillRect(250, 305, 5, 40);
		c1.fillPolygon(xpointsR1, ypointsR1, 4);
		c1.fillPolygon(xpointsR2, ypointsR2, 4);
		// the 'S' in 'Rocks'
		c1.fillRect(310, 260, 5, 40);
		c1.fillRect(320, 260, 30, 5);
		c1.fillRect(320, 295, 30, 5);
		c1.fillRect(355, 305, 5, 40);
		c1.fillRect(320, 340, 30, 5);
	}
	
	public static void part2(){
		DrawingPanel panel = new DrawingPanel(1000, 850);
		Graphics g = panel.getGraphics();
		panel.setBackground( Color.decode("0xF2E0F7"));

		rect(4, 300, 300, g);
	}
	
	public static void rect(int levels, int x, int y, Graphics g){
		
		int squareX1 = square;
		int squareY1 = square;
		int squareX2 = square;
		int squareY2 = square;
		int x1 = x;
		int y1 = y;
		int x2 = x;
		int y2 = y;
		int x3 = x;
		int y3 = y;
		int x4 = x;
		int y4 = y;
		
		for(int i = 0; i < levels; i++){
			// white section
			y2 -= square;
			g.setColor(Color.WHITE);
			g.fillRect(x1, y1, squareX1, squareY1);
			g.fillRect(x2, y2, squareY1, squareX1);
			
			g.setColor(Color.BLACK);
			g.drawRect(x1, y1, squareX1, squareY1);
			g.drawRect(x2, y2, squareY1, squareX1);
			
			squareX1 = square;
			squareY1 += square * 2;
			x1 += square;
			y1 -= square;
			x2 -= square;
			
			// gray section
			y4 -= square;
			x3 -= square;
			x4 -= square;
			
			g.setColor(Color.GRAY);
			g.fillRect(x3, y3, squareX2, squareY2);
			g.fillRect(x4, y4, squareY2, squareX2);
			
			g.setColor(Color.BLACK);
			g.drawRect(x3, y3, squareX2, squareY2);
			g.drawRect(x4, y4, squareY2, squareX2);
			
			squareX2 = square;
			squareY2 -= square * 2;
			//x3 -= square;
			y3 += square;
			//x4 -= square;
			
		}

		
		
	}
}