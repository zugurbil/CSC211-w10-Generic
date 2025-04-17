package Generic;

public class MethodDemo5 {
	/**
	   This program demonstrates a simple generic method.
	*/
	
   public static void main(String[] args)
	   {
	      String[] names = { "Alfonso", "Beatrice", "Celine" };
	      displayArray(names);
	   }
	   
	   /**
	      The displayArray method displays each element
	      in an array.
	      @param array The array to display.
	   */
	   
	   public static <E> void displayArray(E[] array)
	   {
	      for (E element : array)
	         System.out.println(element);
	   }
}
