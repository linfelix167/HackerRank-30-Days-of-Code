import java.io.*;
import java.util.*;
/**
 * Day 20 Sorting
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];

        for(int i = 0; i < n; i++){
          x[i] = in.nextInt();
        }
        bubbleSort(x);
    }

    public static void bubbleSort(int[] x){
      // Track number of elements swapped during a single array traversal
      int numberOfSwaps = 0;
      for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x.length - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
         if (x[j] > x[j + 1]) {
            int tmp = x[j];
            x[j] = x[j+1];
            x[j+1] = tmp;
            numberOfSwaps++;
         }
      }
     // If no elements were swapped during a traversal, array is sorted
     if (numberOfSwaps == 0) {
        break;
     }
   }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: "+ x[0]);
        System.out.println("Last Element: "+ x[x.length-1]);
      }
    }

