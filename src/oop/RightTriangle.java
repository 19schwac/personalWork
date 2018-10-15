package oop;

public class RightTriangle {
private double base;
private double height;
public RightTriangle(){
	base = 2.0;
	height = 1.0;
}
public RightTriangle(double newBase, double newHeight){
	base = newBase;
	height = newHeight;
}
public double hypot(){
	double hypot = Math.hypot(base,height);
	return hypot;
}
public double perimeter(){
	double perimeter = base+height+Math.hypot(base,height);
	return perimeter;
}
public double area(){
	double area = (base*height)/2.0;
	return area;
}
}
