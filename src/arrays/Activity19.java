package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<FriendClass> friend = new ArrayList<FriendClass>();
		friend.add(new FriendClass("Christian", 17));
		friend.add(0, new FriendClass("Josh", 7));
		friend.add(0, new FriendClass("Kenny", 3));
	}

}
