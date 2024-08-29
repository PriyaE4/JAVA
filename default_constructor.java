package programs;
class Cat{
	String name;
	int age;
	public Cat() {
		String n = "Unknown";
		int a = 0;
		this.name = n;
		this.age = a;
		System.out.println("Name: "+n+"\nAge: "+a);
	}
}
public class default_constructor {
	public static void main(String[] args) {
	new Cat();
 }
}
