package Assignment2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		// Write JAVA program to find the sum of all numbers except the maximum number. 
		// Assume that the maximum number is present only once. Do not use subtraction. [Arrays, Loops, Decision Statement]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		int [] arr = new int[n];
		int max = 0;
		int sum = 0;
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Enter Element "+(i+1)+": ");
			arr[i] = input.nextInt();
		}for(int i = 0 ; i< n ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}for(int i = 0 ; i< n ; i++) {
			if(arr[i] != max) {
				sum += arr[i];
			}
		}System.out.println("Maximum Number is : " + max);
		System.out.println("The sum of all numbers except the maximum number is : " + sum);
		input.close();
	}
}
