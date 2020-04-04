package Assignment3;
import java.util.Scanner;
public class Q10 {
	
	public static void main(String[] args) {
		// Write program, which reads a number and finds (sum of digits) smallest factor. If number is 455 then output is 145. 
		// [Sum of digits, smallest factor, power] 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = input.nextInt();
		int n1 = n;
		int m = 0 , sum = 0;
		while( n != 0) {
			m = n % 10;
			n = n / 10;
			sum += m;
		}
		System.out.println("Sum of Digits of " + n1 + " is : " + sum);
		int j = 0;
		for(int i=2 ; i<=n1 ; i++) {
			if(n1%i == 0){
				j=i;
				break;
			}
		}
		System.out.println("Smallest factor of " + n1 + " is : " + j);
		System.out.println("The output [(Sum of digits)^smallest factor] is : "+Math.pow(sum, j));
		input.close();
	}
}
