package Q4nFactorial;

public class NFactorial {

	public static void main(String[] args) {
	int fact = 1;
	int number = 5; // This is the number you find factorial for
	
	for(int i = 1; i <= number; i++) {
		fact = fact * i;
		System.out.println("Fact = " + fact);
	}
	System.out.println("Factorial of " + number + " is: " + fact);
	}
	
	/*
	 * Fact starts at 1, you want the factorial of 5
	 * Loop has i start at one, its going to be 1, 2, 3, 4, and 5, loops 5 times
	 * fact multiplies by itself each iteration through the loop
	 * fact is 1, so first loop it becomes 1*1, so 1
	 * Then second loop it becomes 1 * 2, so 2
	 * Third 2 * 3, so 6
	 * Fourth 6 * 4, so 24
	 * then 24 * 5, so the 120
	 * 
	 */

}
