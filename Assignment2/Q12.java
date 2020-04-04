package Assignment2;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		// Write JAVA program, which finds the sum of numbers after reversing.
		// (in above case 33+001+77+24+21=156). [reverse of 33, 100, 77,  42 and 12] [Nested Loop]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of Element: ");
		int q = input.nextInt();
		String res = "";
		int sum = 0;
		for(int j = 0 ; j<q ; j++) {
			System.out.println("Enter Element "+(j+1)+": ");
			String x = input.next();
			int n = Integer.parseInt(x);
			int l = x.length();
			int m = 0, p = 0;
			for(int i = 0 ; i<l ; i++) {
				p = n % 10;
				n = n / 10;
				m = 10 * m + p;
			}
			sum += m;
			res += m + "+";			
		}
		int l1 = res.length();
		res = res.substring(0,l1-1);
		res += "=" + sum;
		System.out.println(res);
		input.close();
	}

}
