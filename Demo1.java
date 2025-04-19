package project1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes rectangle = new Rectangle(8, 8);
		Shapes triangle = new Triangle(5, 7);
		Circle circle = new Circle(2);

		System.out.println("Area of Rectangle " + rectangle.getArea());
		System.out.println("Area of Triangle " + triangle.getArea());
		System.out.println("Area of Circle " + circle.getArea());
	}

}
