package designingClasses;
import java.util.Random;
public class PileOJunk {
private int num;
	public PileOJunk(){
		Random genereator = new Random();
		num = 10 + (int) (Math.random() * (100 - 10 + 1));
	}
	public int getSum(int num1 , int num2){
		int sum = num1+num2;
		return sum;
	}
	public void setRandom(int num){
		this.num=num;
	}
}
