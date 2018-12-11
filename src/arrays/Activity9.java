package arrays;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 0;
		int width = 0;
		int max = 56;
		int min = 10;
		int small = 3136;
		int total = 0;
		RectangleClass[] rectangle = new RectangleClass[100];
		for (int i = 0; i < rectangle.length; i++) {
			total++;
			width = min + (int) (Math.random() * (max - min + 1));
			length = min + (int) (Math.random() * (max - min + 1));
			rectangle[i] = new RectangleClass(length, width);
			System.out.println("Rectangle " + total);
			System.out.println("Length: " + length);
			System.out.println("Width: " + width);
			System.out.println("Area: " + rectangle[i].area());
			if (rectangle[i].area() <= small) {
				small = rectangle[i].area();
				rectangle[0] = rectangle[i];
			}
		}
		System.out.println("Smallest Area: " + small);
		System.out.println("First Rectangle Area: " + rectangle[0].area());
	}

}
