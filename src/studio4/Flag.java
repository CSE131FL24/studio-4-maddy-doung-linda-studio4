package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//background
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledRectangle(0, 0, 1, 1); 
		
		//head
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(.5, .5, .25);
		
		//ears
		StdDraw.filledPolygon(new double[] {.55, .65, .625}, new double[] {.7, .7, .9}); 
		StdDraw.filledPolygon(new double[] {.45, .35, .375}, new double[] {.7, .7, .9}); 
		
		//eyes 
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.6, .55, .05);
		StdDraw.filledCircle(.4, .55, .05);

		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.6, .55, .025);
		StdDraw.filledCircle(.4, .55, .025);


		//nose 
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledPolygon(new double[] {.475, .525, .5}, new double[] {.425, .425, .475}); 


		//whiskers
		StdDraw.line(.53, .45, .6, .47);
		StdDraw.line(.53, .45, .6, .45);
		StdDraw.line(.53, .45, .6, .43);

		StdDraw.line(.47, .45, .4, .47);
		StdDraw.line(.47, .45, .4, .45);
		StdDraw.line(.47, .45, .4, .43);

		
	}
}