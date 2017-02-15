import java.io.*;
import java.util.*;
/**
 * Day 29: Bitwise AND
 * 
 * Given set S = {1, 2, 3, ..., N}. Find two integers, A and  B(where A < B), from set S such that the value of A&B 
 * is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       for(int i =0; i < n; i++){
       	int a = in.nextInt();
       	int b = in.nextInt();

       	if(((b-1) | b) > a && b % 2 == 0){
       		System.out.println(b-2);
       	}else{
       		System.out.println(b-1);
       	}
       }
    }
}