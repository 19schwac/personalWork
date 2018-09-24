package mathOperators;
import java.util.Scanner;
public class AverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int average = 0;
		System.out.println("What was the score of the first test?");
		test1 = input.nextInt();
		System.out.println("What was the score of the second test?");
		test2 = input.nextInt();
		System.out.println("What was the score of the third test?");
		test3 = input.nextInt();
		System.out.println("Test 1: " + test1);
		System.out.println("Test 2: " + test2);
		System.out.println("Test 3: " + test3);
		average = (test1+test2+test3)/3;
		System.out.println("Test average: " + average);
	}

}
