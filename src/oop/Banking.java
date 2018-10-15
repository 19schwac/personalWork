package oop;

public class Banking {
	private double balance;
	private double account;
	private double rate;
public Banking(){
	balance = 0.0;
	account =0.0;
	rate = 0.0;
}
public Banking(double newBalance, double newAccount, double newRate){
	balance = newBalance;
	account = newAccount;
	rate = newRate;
}
public void deposit(double newDeposit){
	double deposit = newDeposit;
	balance = deposit+balance;
	
}
public void withdraw(double newWithdraw){
	double withdraw = newWithdraw;
	balance = balance-withdraw;
}
public void intrest(double newRate){
	newRate = rate;
	double intrest = balance*rate;
	balance = balance+intrest;
	
}
public double financeCharge(double charge){
	balance = balance-charge;
	return balance;
}
}
