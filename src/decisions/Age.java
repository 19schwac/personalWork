package decisions;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			int age1 = 0;
			int age2 = 16;
System.out.println("What is your age?");
age1 = input.nextInt();
System.out.println(age1 == age2);
	}

}
