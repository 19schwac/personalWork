package designingClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class PileOJunkTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<PileOJunk> jank = new ArrayList<PileOJunk>();
		for (int i = 0; i < 3; i ++){
			jank.add(new PileOJunk());
		}
		for (PileOJunk x: jank){
			x.setRandom(1);
			System.out.println(x.getSum(1,1));
		}
	}

}
