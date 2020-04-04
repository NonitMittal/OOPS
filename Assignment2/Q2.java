package Assignment2;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {

// Write JAVA program which reads n numbers and finds their sum e.g if n is 5 and given numbers are 33, 100, 77, 42 and 12 
// then output is 33+100+77+42+12=264. [Loop]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		int sum = 0;
		String result = "";
		for(int i = 0 ; i<n ; i++) {
			System.out.println("Enter element"+(i+1)+": ");
			int a = input.nextInt();
			sum += a;
			result += a+"+";
		}
		int l=result.length();
		result = result.substring(0,l-1);
		result += "="+sum;
		System.out.println(result);
		input.close();
	}
}
