/**
 * Day 19 Interface
 * 
 * The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method are 
 * provided for you in the editor below. Write the Calculator class, which implements the AdvancedArithmetic 
 * interface. The implementation for the divisorSum method must be public and take an integer parameter, n, 
 * and return the sum of all its divisors.
 * 
 * @author Felix
 *
 */
public class Calculator implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		if(n == 1)
			sum = 1;
		else{
			for(int i = 1; i <= n; i++){
				if(n % i == 0){
					sum += i;
				}
			}
		}
			
		return sum;
	}

}
