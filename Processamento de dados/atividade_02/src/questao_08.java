import java.util.Scanner;

public class questao_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, divida1, divida2, salarioAtual;

		System.out.println("Informe o sal�rio de Jo�o: ");
		salario = sc.nextDouble();
		System.out.println("Informe o valor da d�vida 1: ");
		divida1 = sc.nextDouble();
		System.out.println("Informe o valor da d�vida 2: ");
		divida2 = sc.nextDouble();

		double multa1 = divida1 * 0.02;
		double multa2 = divida2 * 0.02;

		divida1 = divida1 + multa1;
		divida2 = divida2 + multa2;

		salario = salario - divida1;
		salarioAtual = salario - divida2;

		System.out.println("Restante do sal�rio: " + salarioAtual);

		sc.close();

	}

}
