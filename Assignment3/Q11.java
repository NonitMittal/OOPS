package Assignment3;
import java.util.Scanner;
public class Q11 {
	int join(int x, int y) {
		String num = Integer.toString(x) + Integer.toString(y);
		int num1 = Integer.parseInt(num);
		return num1;
	}
	public static void main(String[] args) {
		
		// Define function  int join(int x, int y). It joins numbers x and y. join(273,4167) returns 2734167.
		Q11 obj = new Q11();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int x = input.nextInt();
		System.out.print("Enter Num2 : ");
		int y = input.nextInt();
		int num = obj.join(x,y);
		System.out.println(num);
		input.close();
	}
}
