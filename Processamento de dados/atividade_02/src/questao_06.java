import java.util.Scanner;

public class questao_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMin, salarioFunc;

		System.out.println("Informe o sal�rio m�nimo: ");
		salarioMin = sc.nextDouble();
		System.out.println("Informe o sal�rio do funcion�rio: ");
		salarioFunc = sc.nextDouble();

		int qtd = (int) (salarioFunc / salarioMin);

		System.out.println("Quantidade de sal�rios m�nimos: " + qtd);

		sc.close();

	}

}
