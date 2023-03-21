package Trainee;

import java.util.Scanner;

public class Treino3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int continua;
		do {
			System.out.print("Enter the number");
			int x = sc.nextInt();
			System.out.println("Tell me the operator(examples: rad, ^ , +...");
			String oper = sc.next();
			System.out.print("Enter the number");
			int y = sc.nextInt();

			if (oper.equals("+")) {
				somar(x, y);

			} else if (oper.equals("-")) {
				subtrair(x, y);

			} else if (oper.equals("/")) {
				dividir(x, y);

			} else if (oper.equals("*")) {
				multiplicar(x, y);

			} else if (oper.equals("^")) {
				potenciacao(x, y);

			} else if (oper.equals("rad")) {
				radiciacao(x, y);

			} else {
				System.out.println("Inform corrects operators");
			}
			System.out.println("\nAgain? (1)yes. (2)no.");
			continua = sc.nextInt();
		} while (continua == 1);

		sc.close();
	}

	static void somar(int x, int y) {
		System.out.println(x + y);

	}

	static void subtrair(int x, int y) {
		System.out.println(x - y);

	}

	static void dividir(int x, int y) {
		System.out.println(x / y);

	}

	static void multiplicar(int x, int y) {
		System.out.println(x * y);

	}

	static void potenciacao(int x, int y) {
		System.out.println(Math.pow(x, y));
	}

	static void radiciacao(double x, double y) {
		System.out.println(Math.sqrt(x));
		System.out.println(Math.sqrt(y));

	}
}
