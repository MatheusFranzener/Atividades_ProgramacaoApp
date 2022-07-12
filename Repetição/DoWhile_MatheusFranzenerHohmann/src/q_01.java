import java.util.Scanner;

public class q_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0, contadorPrimo = 0;

		do {
			System.out.println("Informe um número maior que 1: ");
			numero = sc.nextInt();
			if (numero < 1) {
				break;
			}

			for (int i = numero; i > 0; i--) {
				if (numero % i == 0) {
					contadorPrimo++;
				}
			}

			if (contadorPrimo == 2) {
				System.out.println("O número é primo");
			} else {
				System.out.println("O número não é primo");
			}

		} while (numero > 1);

		sc.close();

	}

}
