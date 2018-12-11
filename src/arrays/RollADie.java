package arrays;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 6;
		int roll = 0;
		int total = 0;
		int[] dice = new int[10000];
		for (int i = 0; i < 10000; i++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			dice[i] = random;
		}
		while(roll <= 0 || roll >= 7) {
		System.out.println("What is a roll of a number on the dice?");
		roll = input.nextInt();
		}
		for (int j = 0; j < 10000; j++) {
			if (dice[j] == roll) {
				total++;
			}
		}
		System.out.println("This value was rolled " + total + " times.");
	}
}
