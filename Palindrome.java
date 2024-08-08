package Programs;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = myObj.nextInt();
		int r = 0;
		int t = n;
		int s = 0;
		while(n>0) {
			r = n%10;
			s = s*10 + r;
			n = n/10;
		}
		if(t==s) {
			System.out.println("The given number is a palindrome.");
		}
		else {
			System.out.println("The given number is not a palindrome.");
		}
	}

}
