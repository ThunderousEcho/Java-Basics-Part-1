import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println(
			"""
Assignment 1:
1)
*
**
***
****
.........
2)
..........
****
***
**
*
3)
     *
    ***
   *****
  *******
...........
4)
............
  *******
   *****
    ***
     *
			""");
		
		Random random = new Random();
		int answer = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
			"""
Assignment 2:
Guess a number 1-100.
			""");
		
		for (int attempt = 0; attempt < 5; attempt++) {
			int guess = scanner.nextInt();
			if (Math.abs(guess - answer) <= 10) {
				
				System.out.println("You were within 10 of the correct answer. The answer was " + answer + ".");
				scanner.close();
				return;
				
			} else {
				System.out.println("Keep guessing!");
			}
		}
		
		System.out.println("Sorry. The answer was " + answer + ".");
		scanner.close();
	}
}
