package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] testScores = new int[10];
		int high = 0;
		int low = 100;
		int total = 0;
		int ave = 0;
		for (int i = 0; i < testScores.length; i++) {
			System.out.println("What was your test score?");
			testScores[i] = input.nextInt();
			if (testScores[i] >= high){
				high = testScores[i];
			}
			if (testScores[i] <= low){
				low = testScores[i];
			}
			total = total + testScores[i];
		}
		System.out.println(high);
		System.out.println(low);
		ave = total / testScores.length;
		System.out.println(ave);
		for (int i = 0; i < testScores.length; i++) {
			System.out.println(testScores[i]);
		}
	}

}
