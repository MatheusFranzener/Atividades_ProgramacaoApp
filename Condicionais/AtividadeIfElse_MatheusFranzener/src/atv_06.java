import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorImposto = 0, novoSalario = 0;

		System.out
				.println("--- MENU OPÇÕES --- \n1- Imposto \n2- Novo Salário \n3- Classificação \nEscolha uma opção: ");
		int opcao = sc.nextInt();

		System.out.println("Informe seu salário: ");
		double salario = sc.nextDouble();

		if (opcao == 1) {
			if (salario < 500) {
				valorImposto = salario * 0.05;
				System.out.println("Valor do imposto: " + valorImposto);
			} else if (salario >= 500 && salario <= 850) {
				valorImposto = salario * 0.1;
				System.out.println("Valor do imposto: " + valorImposto);
			} else if (salario > 850) {
				valorImposto = salario * 0.15;
				System.out.println("Valor do imposto: " + valorImposto);
			}
		} else if (opcao == 2) {
			if (salario > 1500) {
				novoSalario = salario + 25;
				System.out.println("Novo salário: " + novoSalario);
			} else if (salario > 750 && salario <= 1500) {
				novoSalario = salario + 50;
				System.out.println("Novo salário: " + novoSalario);
			} else if (salario >= 450 && salario < 750) {
				novoSalario = salario + 75;
				System.out.println("Novo salário: " + novoSalario);
			} else {
				novoSalario = salario + 100;
				System.out.println("Novo salário: " + novoSalario);
			}
		} else if (opcao == 3) {
			if (salario > 700) {
				System.out.println("Bem remunerado :)");
			} else {
				System.out.println("Mal remunerado :(");
			}
		} else {
			System.out.println("Opção inválida!");
		}

		sc.close();
	}
}
