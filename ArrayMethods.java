/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: returns arays contents in string form
   * 
   * @param int[] of values, must be >= 1 in length
   * 
   * @return array contents in String, separated by commas
  */
  public static String arrayString(int[] a)
  {
   String result = "{ " + a[0];
   //concatenate on each int value 
   for(int i = 1; i < a.length; i++) {
    result+= ", " + a[i];
   }
   result += " }";
   return result;
  }
  
/**
   * DESC: Swaps two values in the array at given indicides
   * 
   * @param array int[] that will be modified
   * @param a index of first element to swap (must be valid index!)
   * @param b index of second element to swap (must be valid index!)
  */  
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
	/**DESCRIPTION: Finds index of min value of an array from start index
   * 
   * @param array in[] to search 
   * @param startIndex index to begin searchh for min at
   * 
   * @return index of the min value, from startIndex to end of array 
  */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex+1; i < array.length; i++) {
      if(minValue > array[i]){
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: reverses contents of array
   * 
   * @param array int[] that will be changed to reverse order 
  */
  public static void reverse(int[] array)
  {
    for (int i = 0; i < array.length/2; i++){
      ArrayMethods.swap(array, i, array.length-1-i);
    }
  }

	/**DESCRIPTION: sorts the array in least to greatest order
   * 
   * @param arrayin{} that will be changed to sort order
   */
  public static void selectionSort(int[] array)
  {
    for(int i =0; i < array.length-1; i++){
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
      ArrayMethods.swap(array, i, indexMinValue);
    }
  
  }

}