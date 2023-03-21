package Trainee;
import java.util.Random;
public class Treino4 {

	public static void main(String[] args) {
		Random generate = new Random();
		
			for( int I = 1; I<=6; I++){
			int x = generate.nextInt(60);
			System.out.println("The drawn numbers were: " + x);
		}	
	}
	
	
	
}
