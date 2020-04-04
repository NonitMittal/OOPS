package Assignment3;
import java.util.Scanner;
public class Q4 {
	
	static float distance(point11 p ,getline l) {
		System.out.println();
		float dist = (( l.a * p.x) + ( l.b * p.y) + l.c)/ (float)(Math.pow(((Math.pow(l.a,2))+Math.pow(l.b,2)), 0.5));
		dist = Math.abs(dist);
		String line = "("+l.a + ")x + (" +l.b+")y + ("+l.c+") =0";
		System.out.println("The perpendicular distance from a pointP("+p.x+" ,"+p.y+") and to a line L["+line+"] is : "+dist + " units..");
		return dist;
	}
	public static void main(String[] args) {
	
		// Define function float distance (point p, line l). Using it write program, which reads a point and a line.
		// The program, finds the distance of the point ‘p’ from the line ‘l’. e.g. input point (2,3) and 
		// line 8x+6y-12=0 distance = (8*2+6*3-12)/(82+62)1/2 = 2.2.
	
		point11 obj1 = new point11();
		getline obj2 = new getline();
		distance(obj1,obj2);
	}
}
class point11{
	Scanner input = new Scanner(System.in);
	float x , y;
	point11(){
		System.out.println("Enter Co-ordinates of Point (x,y): ");
		System.out.println("Enter x:");
		x = input.nextFloat();
		System.out.println("Enter y:");
		y = input.nextFloat();
		System.out.println();
	}
}
class getline{
	Scanner input = new Scanner(System.in);
	int [] arr = new int[] {0,0,0};
	float a,b,c;
	getline(){
		System.out.println("Enter Equation of line (ax+by+c=0): ");
		System.out.println("Equation: ");
		String line = input.nextLine();
		System.out.println();
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
}