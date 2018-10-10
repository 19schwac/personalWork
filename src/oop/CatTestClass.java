package oop;

public class CatTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat bob = new Cat();
System.out.println(bob.getAge());
System.out.println(bob.getSleep());
bob.setAge(5);
bob.setSleep(9);
System.out.println(bob.getAge());
System.out.println(bob.getSleep());
System.out.println(bob.birthday());
System.out.println(bob.sleepMore());
System.out.println(bob.sleepLess());
	}

}
