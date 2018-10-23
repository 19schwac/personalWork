package loops;
import java.util.Scanner;
public class InputMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num = 0;
		System.out.println("What number should we count to by twos?");
		num = input.nextInt();
		while (count <= num) {
			System.out.println(count);
			count = 2 + count;
		}
	}

}