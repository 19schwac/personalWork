package inputExamples;
import java.util.Scanner;
public class InputBones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bones = 0;
		System.out.println("How many bones have you broken?");
		bones = input.nextInt();
		System.out.println("You have broken " + bones + " bone(s).");
	}

}
