import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--- MENU --- \n1- Somar \n2- Raíz");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Informe o primeiro número: ");
			double num = sc.nextDouble();
			;
			System.out.println("Informe o segundo número: ");
			double num2 = sc.nextDouble();
			double soma = num + num2;
			System.out.println("Resultado da soma: " + soma);
		} else if (opcao == 2) {
			System.out.println("Informe o número: ");
			double num = sc.nextDouble();
			double raiz = Math.sqrt(num);
			System.out.println("Raiz: " + raiz);
		}

		sc.close();
	}
}