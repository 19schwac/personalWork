package designingClasses;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 800;
		Scanner input = new Scanner(System.in);
		Random genereator = new Random();
		ArrayList<Integer> score = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++){
			int random = min + (int) (Math.random() * (max - min + 1));
			score.add(random);
		}
		System.out.println("What score do you want to look for?");
		int search = input.nextInt();
		for (int x: score){
			if (x==search){
				System.out.println(x + " is in the database.");
			} else{
				System.out.println(x + " is not in the database.");
			}
		}
	}

}
