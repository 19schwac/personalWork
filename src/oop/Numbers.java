package oop;

public class Numbers {

	public Numbers(){
}
	public void sayNumber(double num){
		System.out.println("Your number is " + num);
	}
	public void sayNumberPlus2(double num){
		num = num+2;
		System.out.println("Your number +2 is " + num);
	}
	public void saySum(double num1, double num2){
		double numTotal = num1+num2;
		System.out.println("The sum of your two numbers is " + numTotal);
	}
}
