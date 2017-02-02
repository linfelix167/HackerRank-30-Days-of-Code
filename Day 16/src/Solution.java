import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Day 16 Exceptions - String to Integer
 * 
 * Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try{
        	System.out.println(Integer.parseInt(S));
        }
        catch(Exception e){
        	System.out.println("Bad String");
        }
    }
}