package Assignment2;
import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write JAVA program to print positional values of digits. Input 21463 output 3, 60, 400, 1000 and 20000. [Loop]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String x = input.next();
		int l = x.length();
		int n = Integer.parseInt(x);
		int a = 0;
		int [] arr = new int [l];
		for (int i = 0 ; i<l ; i++) {
			a = n % 10;
			n = n / 10;
			arr [i] = (int) (a * Math.pow(10,i));
		}
		System.out.println(Arrays.toString(arr));
		input.close();
	}

}
