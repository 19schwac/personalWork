package randomNumbers;

import java.util.Scanner;

public class RollADieTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 1;
		int max = 6;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many times do your roll the die?");
		int num = input.nextInt();
		for (int roll = 1; roll <= num; roll++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			if (random == 1) {
				one++;
			}
			if (random == 2) {
				two++;
			}
			if (random == 3) {
				three++;
			}
			if (random == 4) {
				four++;
			}
			if (random == 5) {
				five++;
			}
			if (random == 6) {
				six++;
			}
		}
		System.out.println("Number of 1s: " + one);
		System.out.println("Number of 2s: " + two);
		System.out.println("Number of 3s: " + three);
		System.out.println("Number of 4s: " + four);
		System.out.println("Number of 5s: " + five);
		System.out.println("Number of 6s: " + six);
		double total = one + two + three + four + five + six;
		double per1 = (one / total) * 100;
		double per2 = (two / total) * 100;
		double per3 = (three / total) * 100;
		double per4 = (four / total) * 100;
		double per5 = (five / total) * 100;
		double per6 = (six / total) * 100;
		System.out.println("Percent of 1s: " + per1 + "%");
		System.out.println("Percent of 2s: " + per2 + "%");
		System.out.println("Percent of 3s: " + per3 + "%");
		System.out.println("Percent of 4s: " + per4 + "%");
		System.out.println("Percent of 5s: " + per5 + "%");
		System.out.println("Percent of 6s: " + per6 + "%");
	}

}
