import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par!");
		}
		if (num % 2 != 0) {
			System.out.println("�mpar!");
		}

		sc.close();

	}

}
