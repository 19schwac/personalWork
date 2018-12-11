package arrays;

import java.util.Scanner;
import java.util.Random;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 0;
		int max = 100;
		int row = 18;
		int column = 5;
		int random = 0;
		FriendClass[][] friend = new FriendClass[row][column];
		for (int i = 0; i < friend.length; i++) {
			for (int j = 0; j < friend[0].length; j++) {
				friend[i][j] = new FriendClass();
				random = min + (int) (Math.random() * (max - min + 1));
				friend[i][j].setAge(random);
			}
		}
		for (int k = 0; k < friend.length; k++) {
			for (int l = 0; l < friend[0].length; l++) {
				System.out.print("Age: " + friend[k][l].getAge() + " ");
			}
			System.out.println();
		}
	}

}
