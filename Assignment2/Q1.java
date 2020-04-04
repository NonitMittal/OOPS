package Assignment2;

public class Q1 {
	public static void main(String[] args) {
		
// Write JAVA program, which will print all odd numbers between 0 and 9, 20 and 29, 40 and 49, … , 80 and 89 and 
// all even numbers between 10 and 19, 30 and 39, … , 90 and 99. [Conditional Statement]

		for (int i = 0 ; i<100 ; i++) {
			if((i>=0 && i<10) || (i>=20 && i<30)|| (i>=40 && i<50)|| (i>=60 && i<70)|| (i>=80 && i<90)){
				if(i%2 != 0) {
					System.out.print(i+" ");
					}
				}
			if((i>=10 && i<20) || (i>=30 && i<40)|| (i>=50 && i<60)|| (i>=70 && i<80)|| (i>=90 && i<100)){
				if(i%2 == 0) {
					System.out.print(i+" ");
					}	
				}
			if(i%10 == 9) {
				System.out.println();
				}
			}
		}
	}