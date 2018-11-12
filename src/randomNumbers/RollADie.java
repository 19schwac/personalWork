package randomNumbers;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 1;
		int max = 0;
	System.out.println("What is the largest number on the die?");
	max = input.nextInt();
	System.out.println("How many times do your roll the die?");
	int num = input.nextInt();
	for (int roll = 1; roll <= num; roll++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			System.out.println("You rolled a: " + random);

			}
		
		
	}

}
