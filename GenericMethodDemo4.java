package Generic;

/**
This program demonstrates a simple generic method.
*
* Common type parameters:
* 	T       for general type
* 	S       for general type when T is already used
* 	E		to represent a type of an element (element of an array list)
*   K		to represent the type of a key in a class with key,value pair.
*   V		to represent the type of a value in a class with key,value pair.
*/

public class GenericMethodDemo4
{
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