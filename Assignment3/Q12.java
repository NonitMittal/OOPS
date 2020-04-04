package Assignment3;
import java.util.Scanner;
public class Q12 {
	int replace(int x, int y) {
		int l = Integer.toString(x).length();
		String num = Integer.toString(y)+Integer.toString(x % (int)(Math.pow(10,l-1)));
		int num1 = Integer.parseInt(num);
		return num1;
	}
	public static void main(String[] args) {
		
		//Define function  int replace(int x, int y). The first digit of the number is replaced by y. replace(27349,5) returns 57349.
		Q12 obj = new Q12();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int x = input.nextInt();
		System.out.print("Enter Num2 : ");
		int y = input.nextInt();
		int num = obj.replace(x,y);
		System.out.println(num);
		input.close();
	}

}
