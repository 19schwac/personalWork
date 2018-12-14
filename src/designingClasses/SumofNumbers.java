package designingClasses;

public class SumofNumbers {
	public static int sumNumbers(int num){
		int sum = 0;
		if(num > 0){
			sum = num + sumNumbers(num-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumNumbers(5));
	
}
	
}
