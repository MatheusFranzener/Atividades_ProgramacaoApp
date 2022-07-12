import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Informe o terceiro número: ");
		double num3 = sc.nextDouble();
		System.out.println("Informe o quarto número: ");
		double num4 = sc.nextDouble();

		if (num4 > num3 && num4 > num2 && num4 > num1) {
			System.out.println("1- " + num4 + "\n2- " + num1 + "\n3- " + num2 + "\n4- " + num3);
		}
		if (num4 > num3 && num4 > num2 && num4 < num1) {
			System.out.println("1- " + num1 + "\n2- " + num4 + "\n3- " + num2 + "\n4- " + num3);
		}
		if (num4 > num3 && num4 < num2 && num4 < num1) {
			System.out.println("1- " + num1 + "\n2- " + num2 + "\n3- " + num4 + "\n4- " + num3);
		}
		if (num4 < num3 && num4 < num2 && num4 < num1) {
			System.out.println("1- " + num1 + "\n2- " + num2 + "\n3- " + num3 + "\n4- " + num4);
		}

		sc.close();

	}

}
