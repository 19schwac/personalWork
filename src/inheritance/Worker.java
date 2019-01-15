package inheritance;

public class Worker extends Employee {
	private int years;

	public Worker() {
		super();
		years = 3;
	}

	public Worker(String newName, double newRate, int newYear) {
		super(newName, newRate);
		years = newYear;
	}
	public double calculatePay(double newHours){
		double hours = newHours;
		double pay = getRate()*hours;
		if (years >= 10){
			double bonus = .2*pay;
			pay = pay+bonus;
		}
		return pay;
	}
	public String toString(){
		return ("Worker, name: " + getName() + ", rate: " + getRate() + ", years: " + years);
	}
}
