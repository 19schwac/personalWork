package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 1.0;
		s2 = 2.0;
		s3 = 3.0;
		s4 = 4.0;
	}

	public Quadrilateral(double news1, double news2, double news3, double news4) {
		s1 = news1;
		s2 = news2;
		s3 = news3;
		s4 = news4;
	}

	public double gets1() {
		return s1;
	}

	public double gets2() {
		return s2;
	}

	public double gets3() {
		return s3;
	}

	public double gets4() {
		return s4;
	}

	public void sets1(double S1) {
		s1 = S1;
	}

	public void sets2(double S2) {
		s2 = S2;
	}

	public void sets3(double S3) {
		s3 = S3;
	}

	public void sets4(double S4) {
		s4 = S4;
	}
	public double perimeter(){
		double sum = s1+s2+s3+s4;
		return sum;
	}
}
