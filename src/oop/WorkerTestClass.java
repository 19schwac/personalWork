package oop;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		System.out.println(bob.getHours());
		bob.setHours(8);
		System.out.println(bob.getHours());
		System.out.println(bob.getRate());
		bob.setRate(13.50);
		System.out.println(bob.getRate());
		System.out.println(bob.payCheck());
		System.out.println(bob.raise(1.50));
		bob = new Worker(10, 20);
		System.out.println(bob.getHours());
		System.out.println(bob.getRate());
		System.out.println(bob.payCheck());
		System.out.println(bob.raise(3.00));
	}

}
