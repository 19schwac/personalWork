package oop;

import java.util.Scanner;

public class House {

	public House(){
}
	public void area(){
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double height = 0.0;
		System.out.println("What is the length of the wall in feet?");
		length = input.nextDouble();
		System.out.println("What is the height of the wall in feet?");
		height = input.nextDouble();
		double area = length*height;
		double time = area/200.0;
		System.out.println("The time is takes to paint the wall is " + time + " hours.");
	}
	public void garden(int row){
		Scanner input = new Scanner(System.in);
		final double WIDTH = 10.0;
		double length = 0.0;
		System.out.println("What is the length of the garden in feet?");
		length = input.nextDouble();
		double plant = row*length;
		double time = (plant/15)*2;
		System.out.println("The time is takes to plant is " + time + " hours.");
	}
	public void pool(double radius, double height){
		Scanner input = new Scanner(System.in);
		final double RATE = 300.0;
		double volume = radius*radius*Math.PI*height;
		double time = (volume*7.48052)/300;
		System.out.println("The time is takes to fill the pool is " + time + " hours.");
		
	}
}
