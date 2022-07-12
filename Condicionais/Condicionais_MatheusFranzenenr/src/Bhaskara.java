import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Informe o valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Informe o valor de C: ");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;

		System.out.println("X1: " + x1 + "\nX2: " + x2);

		sc.close();

	}

}
