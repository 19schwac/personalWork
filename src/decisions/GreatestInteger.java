package decisions;

import java.util.Scanner;

public class GreatestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("What is the first integer?");
		num1 = input.nextInt();
		System.out.println("What is the second interger");
		num2 = input.nextInt();
		System.out.println("What is the third interger");
		num3 = input.nextInt();
		if (num1>num2 && num1>num3)
		{
		System.out.println(num1);
	}
		if (num2>num1 && num2>num3)
		{
		System.out.println(num2);
	}
		if (num3>num1 && num3>num2)
		{
		System.out.println(num3);
	}
	}
}
