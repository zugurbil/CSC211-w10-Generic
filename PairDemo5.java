package Generic;

public class PairDemo5 {
	/**
	   This program demonstrates the Pair class which
	   has two type parameters.
	*/

	
	public static void main(String[] args)
	   {
	      // Create an Integer to hold an ID number.   
	      Integer idNumber = 475;
	      
	      // Create a String to hold a name.
	      String name = "Smith, Sally";
	      
	      // Create a Pair object to hold the ID
	      // number and the name.
	      Pair<Integer, String> myPair = 
	            new Pair<>(idNumber, name);
	      
	      // Display the pair of items.
	      System.out.println("ID Number: " + 
	                         myPair.getFirst());
	      System.out.println("Name: " +
	                         myPair.getSecond());
	      
	      Pair<String, Integer> newPair = 
		            new Pair<>(name, idNumber);
		      
		      // Display the pair of items.
		      System.out.println("ID Number: " + 
		                         newPair.getFirst());
		      System.out.println("Name: " +
		                         newPair.getSecond());
		      	      
	      
	   }
	}
