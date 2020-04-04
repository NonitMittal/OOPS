package Assignment3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		// Write program, which reads four points and finds the point of intersection of the line joining first two points and the last two points. 
		// Let input points be (4,6), (-2,10), (10,2) and (3,6) then the point of intersection is (10,2). [Hint: use above functions]
		
		point_line obj1 = new point_line();
		point_line obj2 = new point_line();
		obj1.display_line();
		obj2.display_line();
		obj1.intersection(obj2);
	}
}
class point_line{
	Scanner input = new Scanner(System.in);
	static int i = 1;
	float x1,x2,y1,y2;
	float m,A,B,C;
	point_line(){
		System.out.println("Enter points for the line"+i+" in the format (x,y): ");
		System.out.println("Point1 co-ordinates: ");
		System.out.println("Enter x:");
		x1 = input.nextFloat();
		System.out.println("Enter y:");
		y1 = input.nextFloat();
		System.out.println();
		
		System.out.println("Point2 co-ordinates: ");
		System.out.println("Enter x:");
		x2 = input.nextFloat();
		System.out.println("Enter y:");
		y2 = input.nextFloat();
		System.out.println();
		System.out.println();
		
		m = (y2 - y1)/(x2 - x1);
		A = 1;
		B = (-1/m);
		C = (y1/m)-x1;
	}
	void display_line() {
		System.out.println("Equation of line"+i+" is : ("+A+") x + ("+B+") y + ("+C+") = 0");
		i++;
		System.out.println();
	}
	void intersection(point_line p) {
		try{
			float x = ((B * p.C)-(C * p.B))/((A * p.B)-(p.A * B));
			float y = -((A * p.C)-(C * p.A))/((A * p.B)-(p.A * B));
			System.out.println("The Intersection is: ("+x+" ,"+y+")");
		}catch(Exception e) {
			System.out.println("NO Intersection....");
		}
	}
	
}