import java.util.Scanner;

public class questao_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double qtdQ, salarioMin, valorQuilo, valorPago, valorDesconto;

		System.out.println("Informe o valor do salário mínimo: ");
		salarioMin = sc.nextDouble();
		System.out.println("Informe a quantidade de quiloWatts consumidas: ");
		qtdQ = sc.nextDouble();

		valorQuilo = salarioMin / 5;
		valorPago = valorQuilo * qtdQ;
		valorDesconto = valorPago * 0.85;

		System.out.println("Valor do quiloWatts: " + valorQuilo + "\nValor pago: " + valorPago
				+ "\nValor com desconto: " + valorDesconto);

		sc.close();

	}

}
