package programs;
class Animals{
	public void eat() {
		System.out.println("The animal is eating.");
	}
	public void sound() {
		System.out.println("Animal is sounding.");
	}
}
class Lion extends Animals{
	public void eat() {
		System.out.println("The Lion is eating.");
	}
	public void sound() {
		System.out.println("Lion is roaring.");
	}
}

class Tiger extends Animals{
	public void eat() {
		System.out.println("The Tiger is eating.");
	}
	public void sound() {
		System.out.println("Sound of a Tiger.");
	}
}

class Panther extends Animals{
	public void eat() {
		System.out.println("The Panther is eating.");
	}
	public void sound() {
		System.out.println("Sound of a panther.");
	}
}

public class Overriding_3 {
	public static void main(String[] args) {
		new Animals().eat();
		new Lion().eat();
		new Tiger().eat();
		new Panther().eat();
	}
}
