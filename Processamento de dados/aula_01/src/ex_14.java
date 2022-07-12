import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num1 = sc.nextInt();
		double tercaParte = num1 / 3;
		System.out.println("Terça parte: " + tercaParte);

		sc.close();
	}

}
