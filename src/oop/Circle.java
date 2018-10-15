package oop;

public class Circle {
private double radius;
	public Circle(){
	radius = 0.0;	
	}
	public Circle(double newRadius){
		radius = newRadius;
	}
	public double getRadius(){
		return radius;
	}
	public double circumference(){
		double circumference = 0.0;
	return circumference = 2*Math.PI*radius;
	}
	public double area(){
		double area = 0.0;
		return area = Math.PI*radius*radius;
	}
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
}
