package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.setPenColor(Color.BLUE);
	    StdDraw.filledRectangle(22.0 / 6, 8, 22.0 / 6, 8);
	    
	    // White stripe
	    StdDraw.setPenColor(Color.WHITE);
	    StdDraw.filledRectangle(22.0 / 2, 8, 22.0 / 6, 8);
	    
	    // Red stripe
	    StdDraw.setPenColor(Color.RED);
	    StdDraw.filledRectangle(22.0 * 5 / 6, 8, 22.0 / 6, 8);
	}
	

	public static void indonesia() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		//white half
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 12, 11, 4);
		
		
		//red half
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 4, 11, 4);
		
	}

	public static void netherlands() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		//red stripe 
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 12.75, 11, 2.66);

		//white stripe 
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 7.45, 11, 2.66);


		//blue stripe
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(11, 2.15, 11, 2.66);

	}

	public static void poland() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		//white half
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 12, 11, 4);
		
		
		//red half
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 4, 11, 4);	}

	public static void thailand() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 16.8, 11, 22/12);	
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 14.2, 11, 22/12);	
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(11, 8, 11, 22/6);	
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 3.9, 11, 22/12);	
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 1.3, 11, 22/12);
		
	
	}

	public static void finland() {
		
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
