package loops;

public class NestedLoopActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		for (count = 1; count <= 4; count = count + 1) {
			for (num = 1; num <= 5; num = num + 1) {
				if (num != 3) {
					System.out.print(num + " ");
				} else {
					System.out.print(count + " ");
				}
			}
			System.out.println();
		}
	}

}
