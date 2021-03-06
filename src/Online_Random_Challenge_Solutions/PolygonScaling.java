package binaryIO;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.geometry.Point2D;
public class PolygonScaling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		List<points> listOfpoints = new ArrayList<>();
		
		//Input the Array
		for (int i = 0; i < N ; i++) {
			listOfpoints.add(new points(input.nextInt(),input.nextInt()));
		}
		
		//Taking Other Inputs and Processing
		int angle = input.nextInt();
		int scalingFactor = input.nextInt();
		int[] contextPoint = {input.nextInt(),input.nextInt()};
		
		for (int i = 0; i < N ; i++){
			double x = listOfpoints.get(i).getX();
			double y = listOfpoints.get(i).getY();
			
			//Rotation:
			double s = Math.sin(angle);
			double c = Math.cos(angle);
			//Pushing back to Context Point
			x -= contextPoint[0];
			y -= contextPoint[1];
			
			//Coordinates after Rotation
			x = x * c - y * s;
			y = x * s + y * c;
			
			x += contextPoint[0];
			y += contextPoint[1];
			
			//Scaling
			x = (int) (x*scalingFactor);
			y = (int) (y*scalingFactor);
			
			//Updating
			listOfpoints.get(i).setX(x);
			listOfpoints.get(i).setY(y);
		}
		
		//Displaying the Array
				for (int i = 0; i < N ; i++) {
					System.out.print((listOfpoints.get(i).getX())+" ");
					System.out.print(listOfpoints.get(i).getY());
					System.out.println();
				}
	}
}

