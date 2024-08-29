package programs;
class Dog{
	String name;
	String colour;
	public Dog(String name, String colour) {
		this.name = name;
		this.colour = colour;
		System.out.println("Name: "+name+"\nColour: "+colour);
	}
}
public class parameterized_constructor {
	public static void main(String[] args) {
	new Dog("Puppy","Brown");
	}
}
