package Assignment2;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		
		// Write JAVA program, which reads a number and deletes the maximum digit. Assume that all digits in the number are distinct.
		// e.g. input 237436 output 23436. [Arrays, Loops, Decision Statement]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String n1 = input.next();
		int l = n1.length();
		int n = Integer.parseInt(n1);
		int [] arr = new int[l];
		int m = 0;
		for (int i=0 ; i<l ; i++) {
			m = n%10;
			n = n/10;
			arr [i] = m;
		}
		int max = arr[0];
		for (int i=0 ; i<l ; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		String num = "";
		for (int i=l-1 ; i>=0 ; i--) {
			if(arr[i] != max) {
				num += Integer.toString(arr[i]);
			}
		}
		System.out.println("Number after deleting the maximum digit is: "+num);
		input.close();
	}

}
