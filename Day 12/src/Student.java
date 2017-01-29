/**
 * Day 12 Inheritance
 * 
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
 * Completed code for Person and a declaration for Student are provided for you in the editor. 
 * Observe that Student inherits all the properties of Person.
 * 
 * @author Felix
 *
 */
public class Student extends Person{
  
	private int[] testScore;
	
	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScore = testScores;
	}

	public char calculate() {
		double total = 0;
		int count = 0;
		for(int i = 0; i < testScore.length; i++){
			total += testScore[i];
			count++;
		}
		double average = total / count;
		
		if(average >= 90) return 'O';
		else if(average >= 80) return 'E';
		else if(average >= 70) return 'A';
		else if(average >= 55) return 'P';
		else if(average >= 40) return 'D';
		else return 'T';
	
	}
}