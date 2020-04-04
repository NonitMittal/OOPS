package Assignment3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// Write program, which reads two lines and finds the point of intersection. To accomplish it define a function point intersection 
		// (line g, line h). e.g. Input 2x+3y-26=0 and 4x+7y-54=0 output (10,2).
		
		line a1 = new line();
		line a2 = new line();
		a1.intersection(a1, a2);
	}
}
class line{
	Scanner input = new Scanner(System.in);
	String line;
	int a,b,c;
	static int i = 1;
	int [] arr = new int[] {0,0,0};
	line(){
		System.out.println("Enter Line in the format (ax + by + c = 0)");
		System.out.println("Enter Equation of line"+i+" : ");
		line = input.nextLine();
		i++;
		int l = line.length();
		for(int j = 0 ; j<l ; j++) {
			if(line.charAt(j) == 'x') {
				arr[0] = j;
			}
			if(line.charAt(j) == 'y') {
				arr[1] = j;
			}
			if(line.charAt(j) == '=') {
				arr[2] = j;
			}
		}
		a = Integer.parseInt(line.substring(0,arr[0]));
		b = Integer.parseInt(line.substring(arr[0]+1,arr[1]));
		c = Integer.parseInt(line.substring(arr[1]+1,arr[2]));
	}
	void intersection(line g , line h) {
		int x = ((g.b * h.c)-(g.c * h.b))/((g.a * h.b)-(g.b * h.a));
		int y = -((g.a * h.c)-(g.c * h.a))/((g.a * h.b)-(g.b * h.a));
		System.out.println("Intersection of lines is : ("+x+", "+y+")");
	}
	
}