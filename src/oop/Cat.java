package oop;

public class Cat {
private int age;
private int sleep;
public Cat(){
	age = 0;
	sleep = 0;
}
public int getAge(){
	return age;
}
public int getSleep(){
	return sleep;
}
public void setAge(int newAge){
	age = newAge;
}
public void setSleep(int newSleep){
	sleep = newSleep;
}
public int birthday(){
	int birthday = age+1;
	return birthday;
}
public int sleepMore(){
	int moreSleep = sleep+1;
	return moreSleep;
}
public int sleepLess(){
	int lessSleep = sleep-1;
	return lessSleep;
}
}
