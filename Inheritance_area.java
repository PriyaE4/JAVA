package programs;
class Shape{
	public void getArea() {
		System.out.println("Area is the space occupied by the shape.");
	}
}
class Rectangle extends Shape{
public void getArea() {
		int length = 40;
		int breadth = 20;
		System.out.println("The area of the rectangle is: "+(length*breadth));
	}
}
public class Inheritance_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rectangle().getArea();
	}
}
