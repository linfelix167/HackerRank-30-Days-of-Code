import java.io.*;
import java.util.*;
/*
 * Day 10 Binary Numbers
 * 
 * Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting 
 * the maximum number of consecutive 1's in n's binary representation.
 */
public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      String[] str = Integer.toBinaryString(n).split("[0]+");

      int count = 0;
      for(String a : str){
        if(a.length() > count){
          count = a.length();
        }
      }
      System.out.println(count);
    }
}