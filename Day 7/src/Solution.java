import java.util.Scanner;

/**
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 * @author Felix
 *
 */
public class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < array.length; i++){
			array[i] = in.nextInt();
		}

		for(int i = n-1; i < array.length; i--){
			System.out.print(array[i]+" ");
		}
	}
}