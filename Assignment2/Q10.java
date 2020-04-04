package Assignment2;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {

		// Write JAVA program, which finds sum of those numbers whose first digit is 1. (in above case 100+12=112) 
		// [First digit to be 1 from 33, 100, 77,  42 and 12] [Nested Loop]

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of ELements: ");
		int n = input.nextInt();
		String res= "";
		int sum = 0;
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Enter Element "+(i+1)+": ");
			String x = input.next();
			int l = x.length();
			int x1 = Integer.parseInt(x);
			if( (int)(x1 / Math.pow(10,l-1)) == 1) {
				sum += x1;
				res += x+"+";
			}
		}
		int l1=res.length();
		res = res.substring(0,l1-1);
		res += "="+sum;
		System.out.println("Sum of No. with first digit is 1 is :"+res);
		input.close();
	}

}
