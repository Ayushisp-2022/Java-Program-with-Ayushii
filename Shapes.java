package project1;

public interface Shapes {
	int getArea();

}

//Area of Rectangle
class Rectangle implements Shapes {
	private int length;
	private int bredth;

	Rectangle(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	public int getArea() {
		return length * bredth;
	}
}

//Area of Triangle
class Triangle implements Shapes {
	private int base;
	private int height;

	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getArea() {
		return base * height;
	}
}

//Area of Circle
class Circle implements Shapes {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public int getArea() {
		return (int) Math.PI * radius * radius;
	}
}