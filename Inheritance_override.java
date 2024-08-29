package programs;
class Animal{
	public void move() {
		System.out.println("The animal is moving...");
	}
}
class Cheetah extends Animal{
	public void move() {
		System.out.println("The Cheetah is running...");
	}
}
public class Inheritance_override {
	public static void main(String[] args) {
		new Cheetah().move();
	}
}
