package loops;

public class NestedLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		for (count = 1; count <= 4; count = count + 1) {
			for (num = 1; num <= 5; num = num + 1) {
				System.out.print(num * count + " ");
			}
			System.out.println();
		}
	}

}
