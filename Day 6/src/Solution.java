import java.io.*;
import java.util.*;
/*
 * Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed 
 * and odd-indexed characters as 2 space-separated strings on a single line.
 * Note: 0 is considered to be an even index.
 */
public class Solution {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    
    for(int j = in.nextInt(); j >= 1 && j <= 10; j-- ){
        
    	String s = in.next();
    char[] charArray = s.toCharArray();
    	
    	for(int i = 0; i < charArray.length; i++){
        		
    		if(i%2 == 0){
                System.out.print(charArray[i]);
              }
        }

        System.out.print(" ");
        
        for(int i = 0; i < charArray.length; i++){
            
        	if(i%2 == 1){
                  System.out.print(charArray[i]);
                }
          }
        System.out.println();
      }
  }
}