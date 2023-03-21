package Trainee;
import java.util.Scanner;
public class Treino5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Tell the radius of the area");
		double r = sc.nextDouble();
		double A = Math.PI* Math.pow(r, 2);
		double P = 2*Math.PI*r;
	
	System.out.println("Tell coordinates of the circle");
		int Xc = sc.nextInt();
		int Yc = sc.nextInt();
		
	System.out.println("Tell coordinates the point");
		int Xp = sc.nextInt();
		int Yp = sc.nextInt();
		
	System.out.println("The area are: " + A);
	System.out.println("The perimeter are: " + P);
	
		double distance = Math.sqrt( Math.pow(Xp-Xc, 2)+ Math.pow(Yp, Yc));
	
		if(distance<=r) {
			System.out.println("The point is inside the circle");
			
		}else { 
			System.out.println("The point is outside the circle");
		}
	
		sc.close();
	}

}
