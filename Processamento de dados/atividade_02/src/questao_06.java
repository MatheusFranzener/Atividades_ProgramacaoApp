import java.util.Scanner;

public class questao_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMin, salarioFunc;

		System.out.println("Informe o salário mínimo: ");
		salarioMin = sc.nextDouble();
		System.out.println("Informe o salário do funcionário: ");
		salarioFunc = sc.nextDouble();

		int qtd = (int) (salarioFunc / salarioMin);

		System.out.println("Quantidade de salários mínimos: " + qtd);

		sc.close();

	}

}
