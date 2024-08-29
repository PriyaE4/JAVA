package programs;
class Computer{
	static class Processor{
		String s = "Successfully entered into inner class";
		public void display_details() {
			String brand = "Intel";
			int speed = 1000000;
			System.out.println("Brand: "+brand+"\nSpeed: "+speed);
		}
	}
}
public class Inner_outer {
	public static void main(String[] args){
	Computer c = new Computer();
	Computer.Processor p = new Computer.Processor();
	p.display_details();
}
}