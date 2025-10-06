package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		// base !!!
		StdDraw.setPenColor(178,255,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(251,172,190);
		StdDraw.filledRectangle(0.5, 0.75, 0.5, 0.25);

		StdDraw.setPenColor(44,73,127);
		
		// sword !!!
		StdDraw.filledRectangle(0.5, 0.5, 0.05, 0.4);

		StdDraw.setPenColor(Color.white);

		// heart !!!
		// diamonds
		double[] xd = {.5, 0.75, 0.5, 0.25};
    	double[] yd = {0.25, 0.5, 0.65, 0.5};
    	StdDraw.filledPolygon(xd, yd);
	
    	// half circles
    	StdDraw.filledCircle(0.65, 0.61, 0.15);
    	StdDraw.filledCircle(0.35, 0.61, 0.15);
	}
}