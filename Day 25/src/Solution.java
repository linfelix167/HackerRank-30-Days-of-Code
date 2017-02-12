import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Day 25 Running Time and Complexity
 * 
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, 
 * determine and print whether it's Prime or Not Prime.
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){	      		
        		array[i] = in.nextInt();
        		
        		if(isPrime(array[i])){
        			System.out.println("Prime");
        		}else{
        			System.out.println("Not prime");
        		}
        }
    }
    
    public static boolean isPrime(int a){
    		if(a < 2) return false;
    		if(a == 2) return true;
    		if(a % 2 == 0) return false;
    		for(int i = 3; i * i <= a; i += 2)
    			if(a % i == 0) return false;
    		return true;
    }
}
