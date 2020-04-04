package Assignment2;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		
		// Write JAVA programs read n and n numbers and find their maximum e.g  if n=5 and given numbers are 32, 100, 77,  83 and 12 
		// then output is 100 [Arrays, Loops, Decision Statement]

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		System.out.println("Enter Element 1: ");
		int max = input.nextInt();
		int [] arr = new int[n];
		arr[0] = max;
		for(int i = 1 ; i< n ; i++) {
			System.out.println("Enter Element "+(i+1)+": ");
			arr[i] = input.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Number is : " + max);
		input.close();
	}
}
