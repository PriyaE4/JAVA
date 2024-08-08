package Programs;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = myObj.nextInt();
		int count =0;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 0) System.out.println("It is a prime number.");
		else System.out.println("It is not a prime number.");
	}

}
