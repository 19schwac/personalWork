package inheritance;

public class Paralleogram extends Quadrilateral{
private double paraHeight;
	public Paralleogram(){
		super();
		paraHeight = 3;
	}
	public Paralleogram(double side1, double side2, double newHeight){
		super(side1, side1, side2, side2);
		paraHeight = newHeight;
	}
	public double perimeter(){
		double side1 = gets1();
		double side2 = gets3();
		return side1*2+side2*2;
	}
	public double area(){
		double base = gets4();
		return base*paraHeight;
	}
	public void setHeight(double newParaHeight){
		paraHeight = newParaHeight;
	}
	public double getHeight(){
		return paraHeight;
	}
	public String toString(){
		return ("Paralleogram Object, height: " + paraHeight + super.toString());
	}
}
