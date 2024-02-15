package shapeexecutor;

import base.Shape;
import shapeimplementations.Circle;
import shapeimplementations.Triangle;

public class ShapeExecutor {

	public static void main(String[] args) {
		
		// we cannot create object of Shape class because it is Abstract class..
		//Shape shape=new Shape();
		Shape s;
		
		s= new Triangle();	
		s.draw();
		
		s= new Circle();
		s.draw();
		
		
		Triangle t1 =new Triangle();
		t1.draw();
		Circle c1=new Circle();
		c1.draw();
	}

}
