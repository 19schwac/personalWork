package strings;

import java.util.Scanner;

public class Activity14Essay {
	private String name;
	private String essay;

	public Activity14Essay() {
		essay = "";
		name = "";
	}

	public void setName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your first and last name.");
		name = input.nextLine();
	}

	public void setText() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your essay.");
		essay = input.nextLine();
	}

	public String returnLast() {
		String lastName = "";
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == ' ') {
				lastName = name.substring(i + 1, name.length());
			}
		}
		return lastName.toUpperCase();
	}

	public int returnFirst() {
		int count = 0;
		for (int i = 0; name.charAt(i) != ' '; i++) {
			count++;
		}
		return count;
	}
	public Boolean returnPredicate(){
		boolean predicate = false;
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'x' || name.charAt(i) == 'X') {
				predicate = true;
			}
		}
		return predicate;
	}
	public int returnWords(){
		int word = 0;
		for (int i = 0; i < essay.length(); i++) {
			if (essay.charAt(i) == ' ') {
				word++;
			}
		}
		return word;
	}
}
