package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int red = in.nextInt();
		int blue = in.nextInt();
		int green = in.nextInt();
		boolean fill = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		StdDraw.setPenColor(red, blue, green); 
		if (fill == true) {
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		} else {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		in.close();
	}
}
