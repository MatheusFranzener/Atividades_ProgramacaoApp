import java.util.Scanner;

public class q_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double qntQ = 1, valorQ = 0, valorPago = 0, faturamento = 0;
		;
		int tipoConsumidor = 0, qntConsumidor = 0;

		System.out.println("Informe o valor do salário mínimo: ");
		double salario = sc.nextDouble();

		valorQ = salario / 8;

		while (qntQ != 0) {
			System.out.println("Informe a quantidade de quilowatts gasta: ");
			qntQ = sc.nextDouble();
			if (qntQ == 0) {
				break;
			}
			System.out.println("Informe o tipo de consumidor (1 - residencial 2 - comercial 3 - industrial): ");
			tipoConsumidor = sc.nextInt();
			switch (tipoConsumidor) {
			case 1:
				valorPago = (valorQ * qntQ) * 1.05;
				break;
			case 2:
				valorPago = (valorQ * qntQ) * 1.10;
				break;
			case 3:
				valorPago = (valorQ * qntQ) * 1.15;
				break;
			}

			if (valorPago >= 500 && valorPago <= 1000) {
				qntConsumidor++;
			}

			faturamento += valorPago;

			System.out.println("Preço por Quilowatts: " + valorQ + "\nValor pago com acréscimo: " + valorPago);
		}

		System.out.println("Faturamento da empresa: " + faturamento
				+ "\nQuantidade de consumidores que pagam entre R$500,00 e R$1.000,00: " + qntConsumidor);

		sc.close();

	}

}
