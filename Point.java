package Generic;

public class Point <T>{
	/**
	   The Point class holds X and Y coordinates. The data type
	   of the coordinates is generic.
	*/

	   private T xCoordinate;  // The X coordinate
	   private T yCoordinate;  // The Y coordinate
	   
	   /**
	      Constructor
	      @param x The X coordinate.
	      @param y The Y coordinate.
	   */
	   
	   public Point(T x, T y)
	   {
	      xCoordinate = x;
	      yCoordinate = y;
	   }
	   
	   /**
	      The setX method sets the X coordinate.
	      @param x The value for the X coordinate.
	   */
	   
	   public void setX(T x)
	   {
	      xCoordinate = x;
	   }

	   /**
	      The setY method sets the Y coordinate.
	      @param y The value for the Y coordinate.
	   */
	   
	   public void setY(T y)
	   {
	      yCoordinate = y;
	   }

	   /**
	      The getX method returns the X coordinate.
	      @return The value of the X coordinate.
	   */
	   
	   public T getX()
	   {
	      return xCoordinate;
	   }

	   /**
	      The getY method returns the Y coordinate.
	      @return The value of the Y coordinate.
	   */
	   
	   public T getY()
	   {
	      return yCoordinate;
	   }
}

