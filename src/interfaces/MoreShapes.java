package interfaces;
import java.util.ArrayList;
public class MoreShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double total = 0.0;
Circle round = new Circle(3);
Rectangle box = new Rectangle(5,5);
ArrayList <InterfaceNumeroUno> shape = new <InterfaceNumeroUno> ArrayList();
shape.add(box);
shape.add(round);
for (int i = 0; i <= shape.size()-1; i++){
	total += shape.get(i).area();
}
double min = 9999.9;
for (int j = 0; j <= shape.size()-1; j++){
	if(shape.get(j).perimeter() <= min){
		min = shape.get(j).perimeter();
	}
}
System.out.println("Area: " + total);
System.out.println("Smallest Perimeter: " + min);
	}

}
