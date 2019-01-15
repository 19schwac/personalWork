package inheritance;

public class Employee {
private String name;
private double rate;
public Employee(){
	name = "Steve";
	rate  = 0.0;	
}
public Employee(String newName, double newRate){
	name = newName;
	rate = newRate;
}
public double CalculatePay(double newHours){
	double hours = newHours;
	double pay = rate*hours;
	return pay;
}
public double getRate(){
	return rate;
}
public String getName(){
	return name;
}
public void setRate(double newRate){
	rate = newRate;
}
public void setName(String newName){
	name = newName;
}
public String toString(){
	return ("Employee, name: " + name + ", rate: " + rate);
}
public boolean equals(Object anObject){
	return (this.toString().equals(anObject.toString()));
}
}
