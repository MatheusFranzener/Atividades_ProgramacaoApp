import java.util.Scanner;

public class questao_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3, resultado;

		System.out.println("Informe o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		num2 = sc.nextDouble();
		System.out.println("Informe o terceiro n�mero: ");
		num3 = sc.nextDouble();

		resultado = num1 * num2 * num3;

		System.out.println("Resultado: " + resultado);

		sc.close();

	}

}
