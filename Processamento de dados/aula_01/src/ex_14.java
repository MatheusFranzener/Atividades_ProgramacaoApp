import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int num1 = sc.nextInt();
		double tercaParte = num1 / 3;
		System.out.println("Ter�a parte: " + tercaParte);

		sc.close();
	}

}
