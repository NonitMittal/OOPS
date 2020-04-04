package Assignment2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		// Write JAVA program, which finds sum of numbers after deleting first digit. 
		// (in above case 3+00+7+2+2=14). [delete first digit from 33, 100, 77,  42 and 12] [Nested Loop]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		int m=0;
		int sum = 0;
		String res= "";
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Enter Element "+(i+1)+": ");
			String a = input.next();
			int l = a.length();
			int x = Integer.parseInt(a);
			m = (int)(x % Math.pow(10,l-1));
			res += m+"+";
			sum += m;
		}
		int l1=res.length();
		res = res.substring(0,l1-1);
		res += "="+sum;
		System.out.println(res);
		input.close();
	}
}
