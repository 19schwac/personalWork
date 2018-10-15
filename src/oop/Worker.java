package oop;

public class Worker {
	private int hours;
	private double rate;
public Worker(){
hours = 0;
rate = 0.0;
}
public Worker(int newHours, double newRate){
	hours = newHours;
	rate = newRate;
}
public double getHours(){
	return hours;
}
public double getRate(){
	return rate;
}
public void setHours(int newHours){
	hours = newHours;
}
public void setRate(double newRate){
	rate = newRate;
}
public double payCheck(){
	double payCheck = rate*hours;
	return payCheck;
}
public double raise(double raise){
	double newPay = raise+rate*hours;
	return newPay;
	
}
}
