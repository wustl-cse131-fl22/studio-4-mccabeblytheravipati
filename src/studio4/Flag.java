package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//quadrant bagel
		StdDraw.setPenColor(40,179,242);
		StdDraw.filledRectangle(0.25,0.25, 0.25, 0.25); 
		StdDraw.setPenColor(255,207,144);
		StdDraw.filledCircle(0.25,0.25,0.25);
		StdDraw.setPenColor(40,179,242);
		StdDraw.filledCircle(0.25, 0.25, 0.05);
		
		//quadrant star
		StdDraw.setPenColor(255,3,255);
		StdDraw.filledRectangle(0.75,0.25,0.25,0.25);
		StdDraw.setPenColor(Color.YELLOW);
		double x [] = {.6,.75,.9};
		double y [] = {.1,.4,.1};
		StdDraw.filledPolygon(x,y);
		double x2 [] = {.6,.75,.9};
		double y2 [] = {.3,.05,.3};
		StdDraw.filledPolygon(x2,y2);
		
		//quadrant equal
		StdDraw.setPenColor(68,185,72);
		StdDraw.filledRectangle(0.25,0.75,0.25,0.25);
		StdDraw.setPenColor(62,87,129);
		StdDraw.filledRectangle(0.25,0.68,0.15,0.05);
		StdDraw.filledRectangle(0.25,0.82,0.15,0.05);
		
		//quadrant heart
		StdDraw.setPenColor(248,134,72);
		StdDraw.filledRectangle(0.75,0.75,0.25,0.25);
		StdDraw.setPenColor(255,153,187);
		StdDraw.filledCircle(0.66,0.8,0.09);
		StdDraw.filledCircle(0.84,0.8,0.09);
		double x3 [] = {.58,.92,0.75};
		double y3 [] = {.8,.8,0.55};
		StdDraw.filledPolygon(x3,y3);
	}
}