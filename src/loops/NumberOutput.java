package loops;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		for (count = 1; count <= 5; count++) {
			for (num = count; num <= 5; num++) {
				System.out.print(num + " ");
			}
			System.out.println(count);
		}
	}
}
