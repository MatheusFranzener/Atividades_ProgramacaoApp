import java.util.Scanner;

public class q_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numero = 0, soma = 0, qnt = 0, maior = 0, menor = 999, somaPar = 0, mediaPar = 0, qntPar = 0,
				qntImpar = 0, porcentagem = 0;

		while (numero != 30000) {
			System.out.println("Informe um número: ");
			numero = sc.nextDouble();
			if (numero == 30000) {
				break;
			}

			soma += numero;

			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
			if (numero % 2 == 0) {
				qntPar++;
				somaPar += numero;
			} else {
				qntImpar++;
			}
			qnt++;

		}

		mediaPar = somaPar / qntPar;
		porcentagem = (qntImpar / qnt) * 100;

		System.out.println("Soma dos números digitados: " + soma + "\nQuantidade de números digitados: " + qnt
				+ "\nMaior número: " + maior + "\nMenor número: " + menor + "\nMédia dos números pares: " + mediaPar
				+ "\nPorcentagem dos números ímpares: " + porcentagem);

		sc.close();

	}

}
