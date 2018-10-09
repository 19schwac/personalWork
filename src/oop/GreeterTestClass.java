package oop;

public class GreeterTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greeter bob = new Greeter();
bob.sayHello();
System.out.println("I am " + bob.getAge() + " years old.");
bob.setAge(17);
	}

}
