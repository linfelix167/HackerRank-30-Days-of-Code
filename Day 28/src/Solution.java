import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 * 
 * Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data 
 * simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in 
 * "@gmail.com".
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String myRegExString = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(myRegExString);

        ArrayList<String> list = new ArrayList();

        for(int i = 0; i < n; i++){
        	String name = in.next();
        	String email = in.next();

        	Matcher m = p.matcher(email);
        	if(m.find()){
        		list.add(name);
        	}
        }
        
        Collections.sort(list);
        for(String name: list){
        	System.out.println(name);
        }
    }
}
