package arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 50;
		int max = 70;
		Scanner input = new Scanner(System.in);
		Random genereator = new Random();
		ArrayList<RectangleClass> rectangle = new ArrayList<RectangleClass>();
		for (int i = 0; i <= 400; i++) {
			int length = min + (int) (Math.random() * (max - min + 1));
			int width = min + (int) (Math.random() * (max - min + 1));
			rectangle.add(new RectangleClass(length, width));
		}
		rectangle.remove(rectangle.size()-1);
		rectangle.set(0, rectangle.get(rectangle.size()-1));
		for (int j = rectangle.size()-1; j > 0; j--) {
			RectangleClass area = rectangle.get(j);
			System.out.println(area.area());

		}
	}

}
