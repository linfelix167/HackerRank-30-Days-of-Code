import java.util.Scanner;
/*
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
 * and tax percent (the percentage of the meal price being added as tax) for a meal, 
 * find and print the meal's total cost.
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    double mealCost = scan.nextDouble(); // original meal price
	    int tipPercent = scan.nextInt(); // tip percentage
	    int taxPercent = scan.nextInt(); // tax percentage
	    scan.close();

	    double tip = (tipPercent / 100.0) * mealCost;
	    double tax = (taxPercent / 100.0) * mealCost;
	    double total = mealCost + tip + tax;
	    // cast the result of the rounding operation to an int and save it as totalCost 
	    int totalCost = (int) Math.round(total);

	    System.out.println("The total meal cost is "+ totalCost + " dollars.");
	}

}
