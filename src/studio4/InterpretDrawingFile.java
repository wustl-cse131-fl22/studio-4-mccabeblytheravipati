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
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double one = in.nextDouble();
		double two = in.nextDouble();
		double three = in.nextDouble();
		double four = in.nextDouble();
		//now all the entries are saved variables
		
		StdDraw.setPenColor(red,green,blue); //set the pen color
		
		if (shape.equals("rectangle")){
			if (filled==true) {
			StdDraw.filledRectangle(one,two,three,four);
			}
			else {
			StdDraw.rectangle(one,two,three,four);
			}
		}
		//rectangle
			
		if (shape.equals("ellipse")) {
			if (filled==true) {
			StdDraw.filledEllipse(one, two, three, four);	
			}
			else {
			StdDraw.ellipse(one, two, three, four);	
			}
		}
		//ellipse
		
		if (shape.equals("triangle")) {
			double five = in.nextDouble();
			double six = in.nextDouble();
			double doublex [] = {one,three,five};
			double doubley [] = {two,four,six};
			if (filled==true) {
			StdDraw.filledPolygon(doublex,doubley);	
			}
			else {
			StdDraw.polygon(doublex,doubley);	
			}
				
		}
			
	}
		
}

