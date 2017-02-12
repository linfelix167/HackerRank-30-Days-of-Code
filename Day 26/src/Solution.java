import java.io.*;
import java.util.*;
/**
 * Day 26: Nested Logic
 * 
 * Your local library needs your help! Given the expected and actual return dates for a library book, create a program 
 * that calculates the fine (if any). The fee structure is as follows:
 * 
 * If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
 * If the book is returned after the expected return day but still within the same calendar month and year as the 
 * expected return date, fine = 15 Hackos x (the number of days late).
 * If the book is returned after the expected return month but still within the same calendar year as the expected 
 * return date, the fine = 500 Hackos x (the number of days late).
 * If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
 * 
 * @author Felix
 *
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int actualD = in.nextInt();
        int actualM = in.nextInt();
        int actualY = in.nextInt();
        int expectedD = in.nextInt();
        int expectedM = in.nextInt();
        int expectedY = in.nextInt();

        int fine = 0;

        if(actualD <= expectedD && actualM <= expectedM && actualY <= expectedY){
          fine = 0;
        }else if(actualM == expectedM && actualY == expectedY && actualD > expectedD){
          fine = 15 * (actualD - expectedD);
        }else if(actualM > expectedM && actualY == expectedY){
          fine = 500 * (actualM - expectedM);
        }else if(actualY > expectedY){
          fine = 10000;
        }

        System.out.println(fine);
    }
}
