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
		//blade
		StdDraw.filledRectangle(0.5, 0.5, 0.05, 0.3);
		double[] stipX = {0.45, 0.55, 0.5};
		double[] stipY = {0.2005, 0.2005, 0.10};
		StdDraw.filledPolygon(stipX, stipY);
		//guard
		StdDraw.filledRectangle(0.5, 0.8, 0.2, 0.025);
		StdDraw.filledRectangle(0.5, 0.85, 0.03, 0.07);
		StdDraw.filledCircle(0.7, 0.80, 0.04);
		StdDraw.filledCircle(0.3, 0.80, 0.04);
		//pommel
		StdDraw.filledCircle(0.5, 0.945, 0.05);
		StdDraw.setPenColor(Color.white);

		// heart !!!
		// diamonds
		double[] xd = {.5, 0.75, 0.5, 0.25};
    	double[] yd = {0.25, 0.5, 0.65, 0.5};
    	StdDraw.filledPolygon(xd, yd);
	
    	// half circles
    	StdDraw.filledCircle(0.65, 0.61, 0.15);
    	StdDraw.filledCircle(0.35, 0.61, 0.15);

		// cat !!!
    	double catX = 0.5;
    	double catY = 0.5;
    	double catR = 0.1;
    	
    	StdDraw.setPenColor(251,172,190);
    	StdDraw.filledCircle(catX, catY, catR);
    	
    	// ears (pointing upward)
    	double[] xLeftEar = {catX, catX - 0.07, catX - 0.099};
    	double[] yLeftEar = {catY + 0.015, catY + 0.15, catY + 0.02};
    	StdDraw.filledPolygon(xLeftEar, yLeftEar);
    	
    	double[] xRightEar = {catX, catX + 0.07, catX + 0.099};
    	double[] yRightEar = {catY + 0.015, catY + 0.15, catY + 0.02};
    	StdDraw.filledPolygon(xRightEar, yRightEar);
    	
    	// eyes
    	StdDraw.setPenColor(Color.black);
    	StdDraw.filledCircle(catX - 0.06, catY, 0.01);
    	StdDraw.filledCircle(catX + 0.06, catY, 0.01);
    	
    	// mouth
    	StdDraw.setPenColor(Color.black);
    	StdDraw.setFont(new java.awt.Font("arial", java.awt.Font.PLAIN, 18));
    	StdDraw.text(catX, catY - 0.02, "ω");
    	StdDraw.textLeft(0, 0, ""); // forces rendering
    	StdDraw.text(catX, catY - 0.02, "ω");
    	StdDraw.text(catX, catY - 0.02, "ω");
	}
}