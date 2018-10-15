package oop;

public class NumberTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers frank = new Numbers();
		frank.sayNumber(7.5);
		frank.sayNumberPlus2(7.5);
		frank.saySum(1.0, 2.0);
		double answer = frank.returnSquare(9.0);
		System.out.println(answer);
		double area = frank.returnArea(5.0,2.0);
		System.out.println(area);
		int round = frank.returnRoundUp(3.45);
		System.out.println(round);
	}

}
