package Assignment3;
import java.util.Scanner;
public class circle {
	Scanner input = new Scanner(System.in);
	center c;
	float r;
	static String eq1,eq2;
	circle(){
		c = new center();
		System.out.println("Enter Radius of Circle: ");
		r = input.nextFloat();
		eq1 = "[x-("+c.x+")]^2+ [y-("+c.y+")]^2 = "+r*r;
		eq2 = "x^2 + y^2 + (" + -2*c.x + "x) + (" + -2*c.y + "y) + (" + (Math.pow(c.x, 2) + Math.pow(c.y, 2)-r*r) + ") = 0";
	}
	circle(float g,float h,float k){
		c = new center(-g/2 , -h/2);
		r = (float)(Math.pow((-g/2*-g/2 + -h/2*-h/2 - k),0.5));
		eq1 = "[x-("+-g/2+")]^2 + [y-("+-h/2+")]^2 = "+r*r;
		eq2 = "x^2 + y^2 + (" + g + "x) + (" + h + "y) + (" + k + ") = 0";
	}
	static void print(circle c1) {
		float x1 = c1.c.x;
		float y1 = c1.c.y;
		float r = c1.r;
		System.out.println();
		System.out.println("Equation of line with  : ");
		System.out.println("  Center of Circle : (" + x1 + ", " + y1 + ")");
		System.out.println("  Radius : " + r +"   is : ");
		System.out.println("  "+eq1);
		System.out.println("  "+eq2);
	}
	static float distance(center cc , chord cd){
		System.out.println();
		float dist = (( cd.a * cc.x) + ( cd.b * cc.y) + cd.c)/ (float)(Math.pow(((Math.pow(cd.a,2))+Math.pow(cd.b,2)), 0.5));
		dist = Math.abs(dist);
		String line = "("+cd.a + ")x+(" +cd.b+")y+("+cd.c+")=0";
		System.out.println("The perpendicular distance from a pointP("+cc.x+" ,"+cc.y+") and to a line L["+line+"] is : "+dist + " units..");
		return dist;
	}
	static float chord_length(chord cd , circle c2) {
		float dist = distance(c2.c , cd);
		float r = c2.r;
		float len = 2*(float)(Math.pow((r*r - dist*dist),0.5));
		String line = "("+cd.a + ")x+(" +cd.b+")y+("+cd.c+")=0";
		System.out.println("The Lenth of the chord ("+line+") in the circle is : "+len + " units..");
		return len;
	}
	static void intersection(circle c3, chord cd1) {
		System.out.println();
		float z = (float)(Math.pow(((c3.r*c3.r)-((cd1.c-c3.c.x)*(cd1.c-c3.c.x))),0.5));
		float y1 = c3.c.y + z , y2 = c3.c.y - z;
		System.out.println("Points of Intersection of Line with Circle : (" + cd1.c + ", " + y1 + ")  &  (" + cd1.c + ", " + y2 + ")");
	}
}
class center{
	Scanner input = new Scanner(System.in);
	float x;
	float y;
	center(){
		System.out.println("Enter Co-ordinates of Center : ");
		System.out.print("  Enter x : ");
		x = input.nextFloat();
		System.out.print("  Enter y : ");
		y = input.nextFloat();
		System.out.println();
		}
	center(float x1, float y1){
		x = x1;
		y = y1;
	}
}
class chord{
	Scanner input = new Scanner(System.in);
	int [] arr = new int[] {0,0,0};
	float a,b,c;
	chord(){
		System.out.println();
		System.out.println();
		System.out.println("Enter Equation of line (ax+by+c=0): ");
		System.out.println("  Equation: ");
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
	chord(float b1){
		System.out.println("Enter Equation of line format (x=c) : ");
		System.out.println("  Enter c: ");
		c = input.nextFloat();
		System.out.println();
	}
}
