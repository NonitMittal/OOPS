package Assignment2;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		
		// Write JAVA program, which finds the number with maximum sum of digits. e.g. if numbers are 325, 199, 800 
		// then answer is 199. [Arrays, Loops, Decision Statement]
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		String [] arr = new String[n];
		int [] arr1 = new int[n];
		int m = 0;
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Enter Element "+(i+1)+": ");
			arr[i] = input.next();
			int l = arr[i].length();
			int a = Integer.parseInt(arr[i]);
			int sum = 0;
			for(int j = 0 ; j<l ; j++) {
				m = a % 10;
				a = a / 10;
				sum += m;
			} arr1[i]=sum;			
		}
		int max = arr1[0];
		int j = 0;
		for(int i = 0 ; i< n ; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
				j = i;
			}
		}
		System.out.println("The number with maximum sum of digits is: "+arr[j]);
		input.close();
	}

}
