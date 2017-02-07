/**
 * Day 21 Generics
 * 
 * Write a single generic function named printArray; this function must take an array of generic elements as a 
 * parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your 
 * function.
 * 
 * @author Felix
 *
 * @param <T>
 */
public class Printer <T>{
	public <E> void printArray(E[] array){
		for(E element: array){
			System.out.println(element);
		}
	}
}