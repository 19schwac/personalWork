package inheritance;

public class Manager extends Employee{
private int level;
public Manager() {
	super();
	level = 0;
}
public Manager(String newName, double newRate, int newLevel){
	super(newName, newRate);
	level = newLevel;
}
public double calculatePay(double newHours){
	double hours = newHours;
	double pay = getRate()*hours+(level/100);
	return pay;
}
public Object clone() {
	return new Manager(newLevel);
}
}
