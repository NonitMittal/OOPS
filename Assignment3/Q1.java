package Assignment3;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {

		// Define float area(point a, point b, point c). It finds area of triangle ABC. [Find direction corresponding to AB and AC. 
		// Now call cross product and magnitude]. Area of the triangle with end points (3,4,5), (7,3,6) and (6,2,3) is 6.36.
		
		Triangle obj = new Triangle();
		obj.Area();
	}
}
class point{
	Scanner input = new Scanner(System.in);
	float x;
	float y;
	float z;
	static int q = 1;
	point(){
		System.out.println("Enter x"+q+" : ");
		x = input.nextFloat();
		System.out.println("Enter y"+q+" : ");
		y = input.nextFloat();
		System.out.println("Enter z"+q+" : ");
		z = input.nextFloat();
		System.out.println();
		q ++;
	}
}
class Triangle{
	float area;
	point a , b , c;
	Triangle(){
		System.out.println("Co-ordinates of vertex A");
		a = new point();
		System.out.println("Co-ordinates of vertex B");
		b = new point();
		System.out.println("Co-ordinates of vertex C");
		c = new point();
		
		System.out.println("Points of Triangle are: ");
		System.out.println("A ("+ a.x + ", " + a.y + ", " + a.z + ")");
		System.out.println("B ("+ b.x + ", " + b.y + ", " + b.z + ")");
		System.out.println("C ("+ c.x + ", " + c.y + ", " + c.z + ")");
		System.out.println();
	}
	void Area(){
		float abx = b.x - a.x;
		float aby = b.y - a.y;
		float abz = b.z - a.z;
		float acx = c.x - a.x;
		float acy = c.y - a.y;
		float acz = c.z - a.z;
		float i = (aby * acz) - ( abz * acy);
		float j = (abx * acz) - ( abz * acx);
		float k = (aby * acx) - ( abx * acy);
		area = (float)( Math.pow((Math.pow(i,2) + Math.pow(j,2) + Math.pow(k,2)),0.5) )/2;
		System.out.printf("Area of Triangle is: %.2f",area);
	}
}
