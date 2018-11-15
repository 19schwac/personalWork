package strings;

public class EssayTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Activity14Essay paper = new Activity14Essay();
paper.setName();
paper.setText();
System.out.println(paper.returnLast());
System.out.println("Number of characters in first name: " + paper.returnFirst());
System.out.println("Does your name have an x in it? " + paper.returnPredicate());
System.out.println("Your essay has " + paper.returnWords() + " words.");
	}

}
