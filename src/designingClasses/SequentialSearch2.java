package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 499;
		int j = 0;
		Scanner input = new Scanner(System.in);
		Random genereator = new Random();
		ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
		for (int i = 0; i < 100; i++){
			int length = min + (int) (Math.random() * (max - min + 1));
			int width = min + (int) (Math.random() * (max - min + 1));
			rectangle.add(new Rectangle(length,width));
		}
		for (Rectangle x: rectangle){
			if (x.getWidth()==10){
				j++;
			}
		}
		System.out.println("There are " + " rectangles with the width of 10.");
	}

}
