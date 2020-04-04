package Assignment2;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write JAVA program to print the second digit. e.g. input 23516 the output is 3. [Loop].
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String x = input.next();
		System.out.println("Enter digit no. : ");
		int j = input.nextInt();
		int l = x.length();
		int n = Integer.parseInt(x);
		int  n1 = 0;
		for(int i = 1 ; i<=j ; i++) {
			n1 = (int) (n / Math.pow(10,l-i));
			n = (int) (n % Math.pow(10,l-i));
		}
		System.out.println("Digit"+j+" of Number: "+n1);
		input.close();
	}
}
