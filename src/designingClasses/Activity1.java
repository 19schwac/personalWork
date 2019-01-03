package designingClasses;

import java.util.ArrayList;
import java.util.Scanner;

import arrays.CircleClass;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> hi = new ArrayList<Greeter>();
		System.out.println("How many greeters would you like?");
		int greeter = input.nextInt();
		for (int i = 0; i < greeter; i ++){
			hi.add(new Greeter());
		}
		for (Greeter x: hi){
			System.out.println("Greeter:");
			System.out.println(x.getAge());
		}
		
		
	}

}
