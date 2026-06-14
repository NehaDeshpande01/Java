//abstraction example of shape
package NEW;

abstract class Shape {
	abstract void draw();

	void show() {
		System.out.println(" show the shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("draw the circle");
	}

}

class Rectangle extends Shape {
	void draw() {
		System.out.println("show the shape of rectangle");
	}
}

class Ex0{
	public static void main(String[] args) {
		Circle C1 = new Circle();
		C1.draw();
		C1.show();

		Rectangle R2 = new Rectangle();
		R2.draw();
		R2.show();
	}
}