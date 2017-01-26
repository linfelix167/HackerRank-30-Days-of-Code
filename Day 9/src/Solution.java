import java.io.*;
import java.util.*;
/*
 * Day 9 Recursion
 * 
 * Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial) 
 * 
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));

    }

    public static int factorial(int n){
    	if(n == 0){
    		return 1;
    	}else{
    		return n * factorial(n-1);
    	}
    }
}
