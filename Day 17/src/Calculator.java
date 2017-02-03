import java.util.*;
import java.io.*;
/**
 * Day 17 More Exceptions
 * 
 * Write a Calculator class with a single method: int power(int,int). The power method takes two integers, n and p, as 
 * parameters and returns the integer result of n^p. If either n or p is negative, then the method must throw an 
 * exception with the message: n and p should be non-negative.
 * 
 * @author Felix
 *
 */
public class Calculator{
	  public int power(int a, int b) throws Exception{
	    double c;
	    if( a < 0 || b < 0){
	      throw new Exception("n and p should be non-negative");
	    }else{
	      c = Math.pow(a, b);
	    }
	    return (int)c;
	  }
	}
