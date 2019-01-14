package inheritance;
import java.util.ArrayList;
public class ArrayListTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Geo> shape = new ArrayList <Geo>();
for (int i = 0; i<=10; i++){
	if(i < 5){
		shape.add(new Rectangle());
	}else{
		shape.add(new Trapezoid());
	}
}
for (int j = 0; j < shape.size(); j++){
	double area = 0;
	if (shape.get(j).area() >= area){
		area = shape.get(j).area();
	}
}
	}

}