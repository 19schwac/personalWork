package oop;

public class IsoscelesTrapezoid {
private double base1;
private double base2;
private double height;
private double leg;
public IsoscelesTrapezoid(){
	base1 = 0.0;
	base2 = 0.0;
	height = 0.0;
	leg = 0.0;
}
public IsoscelesTrapezoid(double newBase1, double newBase2, double newHeight, double newLeg){
	base1 = newBase1;
	base2 = newBase2;
	height= newHeight;
	leg= newLeg;
}
public double perimeter(){
	double perimeter = base1+base2+height+2.0*leg;
	return perimeter;
}
public double area(){
	double area = ((base1+base2)*height)/2.0;
	return area;
}
}

