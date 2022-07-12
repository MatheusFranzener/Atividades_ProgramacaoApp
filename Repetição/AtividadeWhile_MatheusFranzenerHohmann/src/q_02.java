import java.util.Scanner;

public class q_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero = 1;

		while (numero != 0) {
			System.out.println("Informe um número: ");
			numero = sc.nextDouble();
			if (numero == 0) {
				break;
			}
			double quadrado = Math.pow(numero, 2);
			double cubo = Math.pow(numero, 3);
			double raiz = Math.sqrt(numero);

			System.out.println("Número informado: " + numero + "\nQuadrado: " + quadrado + "\nCubo: " + cubo
					+ "\nRaiz quadrada: " + raiz);

		}

		sc.close();

	}

}
