package Programs;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = myObj.nextInt();
		int p = 1;
		for(int i = 1;i<=n;i++) {
			p*=i;
		}
		System.out.println("The factorial of the given number is:"+p);
	}

}
