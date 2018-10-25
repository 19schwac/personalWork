package loops;
import java.util.Scanner;
public class WriteHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many times should we say hello?");
		int hello = input.nextInt();
		int counter = 0;
		for (counter = 1; counter <= hello; counter = counter + 1) {
			System.out.println(counter + " Hello");
		}
	}

}
