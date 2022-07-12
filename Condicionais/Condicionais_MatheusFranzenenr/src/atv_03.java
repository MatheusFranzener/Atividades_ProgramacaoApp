import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = sc.nextDouble();

		if (num1 > num2) {
			System.out.println("O número maior é: " + num1);
		}
		if (num2 > num1) {
			System.out.println("O número maior é: " + num2);
		}

		sc.close();

	}

}
