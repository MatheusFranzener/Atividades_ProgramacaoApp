import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Informe outro n�mero: ");
		int num2 = sc.nextInt();
		double media = (num1 + num2) / 2;
		System.out.println("M�dia: " + media);

		sc.close();

	}

}
