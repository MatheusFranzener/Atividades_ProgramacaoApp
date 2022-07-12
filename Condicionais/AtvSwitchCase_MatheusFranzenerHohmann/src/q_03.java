import java.util.Scanner;

public class q_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de livros: ");
		int qnt = sc.nextInt();

		double a = (0.25 * qnt) + 7.50;
		double b = (0.50 * qnt) + 2.50;

		if (a > b) {
			System.out.println("Escolha a opção B");
		} else if (b > a) {
			System.out.println("Escolha a opção A");
		} else {
			System.out.println("Você pode obtar por qualquer uma das opções");
		}

		sc.close();
	}

}
