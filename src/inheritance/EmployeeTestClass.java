package inheritance;

public class EmployeeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee steve = new Employee("Henry", 7.50);
System.out.println(steve.CalculatePay(8));
System.out.println(steve.getName());
System.out.println(steve.getRate());
System.out.println(steve.toString());
Worker jesus = new Worker("Jesus", 10, 12);
System.out.println(jesus.calculatePay(8));
System.out.println(jesus.getName());
System.out.println(jesus.getRate());
System.out.println(jesus.toString());
Manager pop = new Manager("Pop", 8.50, 5);
System.out.println(pop.calculatePay(8));
System.out.println(pop.getName());
System.out.println(pop.getRate());
System.out.println(pop.clone());
	}

}
