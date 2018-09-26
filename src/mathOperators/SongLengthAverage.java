package mathOperators;
import java.util.Scanner;
public class SongLengthAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int song = 0;
		int time = 0;
		int minute = 0;
		int second = 0;
		int average = 0;
		int aveMin = 0;
		int aveSec = 0;
		final int MINUTE = 60;
		final int SECOND = 1;
		System.out.println("How many songs will be played?");
		song = input.nextInt();
		System.out.println("How many minutes will the songs last?");
		minute = input.nextInt();
		System.out.println("How many remaining seconds are left?");
		second = input.nextInt();
		time = second+MINUTE*minute;
		average = time/song;
		aveMin = average/MINUTE;
		aveSec = average%MINUTE;
		System.out.println("The average song length is " + aveMin + " minute(s) and " + aveSec + " second(s)");
	}

}
