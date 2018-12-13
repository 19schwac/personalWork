package designingClasses;

public class Greeter {
		private String name;
		private int age;
		public Greeter() {
	age = 0;
	name = "";
		}
		public Greeter(int newAge, String newName){
			age = newAge;
			name = newName;
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
