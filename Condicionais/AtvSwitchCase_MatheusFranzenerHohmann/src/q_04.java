import java.util.Scanner;

public class q_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor da compra: ");
		double compra = sc.nextDouble();
		System.out.println(
				"Escolha uma opção de pagamento: \n1- Á vista \n2- Cheque Pré-datado \n3- Parcelado 6x \n4- Parcelado 12x");
		int opcao = sc.nextInt();

		double valorFinal = 0, valorParcela = 0, diferenca = 0;
		String status = "";

		switch (opcao) {
		case 1:
			valorFinal = compra * 0.85;
			diferenca =  compra - valorFinal;
			break;
		case 2:
			valorFinal = compra * 0.90;
			diferenca =  compra - valorFinal;			
			break;
		case 3:
			valorParcela = compra / 6;
			valorFinal = compra;
			diferenca =  compra - valorFinal;
			break;
		case 4:
			valorFinal = compra * 1.08;
			valorParcela = compra / 12;
			diferenca =  compra - valorFinal;
			break;
		}

		if (diferenca > 0) {
			status = "Desconto";
		} else if (diferenca < 0) {
			status = "Juros";
		} else {
			status = "---";
		}

		System.out.println("Valor Total da compra: " + compra + "\nValor final da compra: " + valorFinal
				+ "\nDiferença: " + "\nStatus: " + status + "\nValor parcela: " + valorParcela);

		sc.close();

	}

}
