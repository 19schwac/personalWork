package inheritance;

public class Rectangle extends Quadrilateral {

	public Rectangle(){
		sets1(5);
		sets2(5);
		sets3(1);
		sets4(1);
	}
	public Rectangle(double recnews1, double recnews2){
		sets1(recnews1);
		sets2(recnews1);
		sets3(recnews2);
		sets4(recnews2);
	}
	public double area(){
		double recs1 = gets1();
		double recs2 = gets2();
		double recs3 = gets3();
		double recs4 = gets4();
		double area = recs1*recs3;
		return area;
	}
}
