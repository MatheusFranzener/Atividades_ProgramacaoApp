import java.util.Scanner;

public class ex_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int num2 = sc.nextInt();
		int produto = num1 * num2;
		System.out.println("Produto: " + produto);

		sc.close();

	}

}
