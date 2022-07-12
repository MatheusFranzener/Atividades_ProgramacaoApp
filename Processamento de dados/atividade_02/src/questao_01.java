import java.util.Scanner;

public class questao_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1, num2, resultado;

		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextDouble();

		resultado = num1 - num2;

		System.out.println("Resultado: " + resultado);

		sc.close();

	}

}
