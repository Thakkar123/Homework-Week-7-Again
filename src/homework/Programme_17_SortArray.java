package homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {

        int[] numArray = {1789,2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual numeric array was:  "+ Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted numeric array is:  "+ Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual string array was: "+ Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted string array is:  "+Arrays.toString(strArray));
      }
}
