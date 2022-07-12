import java.util.Scanner;

public class questao_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double custoTotal, precoIngresso;

		System.out.println("Informe o custo total: ");
		custoTotal = sc.nextDouble();
		System.out.println("Informe o valor do ingresso: ");
		precoIngresso = sc.nextDouble();

		int qtdMinima = (int) (custoTotal / precoIngresso);

		System.out.println("Quantidade mínima de ingressos: " + qtdMinima);

		sc.close();

	}

}
