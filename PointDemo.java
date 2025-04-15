package Generic;

public class PointDemo {
	public static void main(String[] args)
	   {
	      // Create two Double objects to use as coordinates.
	      Double dblX = 1.5;
	      Double dblY = 2.5;
	      
	      Integer intX = 10;
	      Integer intY = 20;
	      
	      
	      // Create a Point object that can hold Doubles.
	      Point<Double> dPoint = new Point<>(dblX, dblY);
	      Point<Integer> iPoint = new Point<>(intX, intY);
	      
	      // Create two Integer objects to use as coordinates.
	     
	      // Create a Point object that can hold Integers.
	      Point<Number> yPoint = new Point<>(intX, intY);
	      Point<Number> xPoint = new Point<Number>(dblX, dblY);
	      Point<Number> zPoint = new Point<Number>(dblX, intY);
	      Point<String> sPoint = new Point<String>("aa", "bb");

	      // Display the Double values stored in dPoint.
	      System.out.println("Here are the values in dPoint.");
	      System.out.println("X Coordinate: " + dPoint.getX());
	      System.out.println("Y Coordinate: " + dPoint.getY());
	      System.out.println();

	      // Display the Integer values stored in iPoint.
	      System.out.println("Here are the values in iPoint.");
	      System.out.println("X Coordinate: " + iPoint.getX());
	      System.out.println("Y Coordinate: " + iPoint.getY());
	      
	      System.out.println("Here are the values in xPoint.");
	      System.out.println("X Coordinate: " + xPoint.getX());
	      System.out.println("Y Coordinate: " + xPoint.getY());
	      System.out.println();

	      System.out.println("Here are the values in yPoint.");
	      System.out.println("X Coordinate: " + yPoint.getX());
	      System.out.println("Y Coordinate: " + yPoint.getY());
	      System.out.println();

	      System.out.println("Here are the values in sPoint.");
	      System.out.println("X Coordinate: " + sPoint.getX());
	      System.out.println("Y Coordinate: " + sPoint.getY());
	      System.out.println();
	   }

}
