package Programs;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the valueof x: ");
		int x = myObj.nextInt();
		System.out.println("Enter the valueof x: ");
		int y = myObj.nextInt();
		int result = x+y;
		System.out.println(result);
	}

}
