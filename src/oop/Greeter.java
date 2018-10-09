package oop;

public class Greeter {
	private int age;
	public Greeter() {
age = 0;

	}
	public void sayHello() {
	System.out.println("Hello");
}
	public int getAge(){
		return age;
	}
	public void setAge(int newAge){
		age = newAge;
		System.out.println("I am " + age + " years old.");
	}
}