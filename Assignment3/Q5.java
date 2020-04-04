package Assignment3;
import java.util.Scanner;
public class Q5 {
	static void distance(point12 p , line12 l) {
		System.out.println();
		float dist = (( l.a * p.x) + ( l.b * p.y) + l.c)/ (float)(Math.pow(((Math.pow(l.a,2))+Math.pow(l.b,2)), 0.5));
		dist = Math.abs(dist);
		System.out.println("The perpendicular distance from a pointP("+p.x+" ,"+p.y+") and to a line L["+l.line+"] is : "+dist + " units..");
	} 
	public static void main(String[] args) {

		// Write program, which reads three points and finds the distance of first point from the line joining other two points. 
		// [Hint: use functions to find equation and distance]
		
		point12 obj1 = new point12();
		line12 obj2 = new line12();
		distance(obj1,obj2);		
	}
}
class point12{
	Scanner input = new Scanner(System.in);
	float x, y ;
	static int i = 1;
	point12(){
		System.out.println("Enter Co-ordintes of Point"+i+" (x,y): ");
		System.out.println("Enter x: ");
		x = input.nextFloat();
		System.out.println("Enter y: ");
		y = input.nextFloat();
		i++;
		System.out.println();
	}
}
class line12{
	float a,b,c;
	String line;
	line12(){
		point12 p = new point12();
		point12 q = new point12();
		float m = (q.y - p.y)/(q.x - p.x);
		a = 1;
		b = -1/m;
		c = (p.y/m)-p.x;
		line = "(" + a + ")x + (" + b + ")y + (" + c + ") = 0";
		System.out.println("The equation of the line joining point ("+p.x+","+p.y+") and ("+q.x+","+q.y+") is : "+line);
	}
}