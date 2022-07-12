import java.util.Scanner;

public class q_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o códigio do seu cargo: \n1- Escriturário \n2- Secretário \n3- Caixa \n4- Gerente \n5- Diretor");
		int opcao = sc.nextInt();

		System.out.println("Informe seu salário: ");
		double salario = sc.nextDouble();

		String cargo = "";
		double valor = 0, novoSalario = 0;

		switch (opcao) {
		case 1:
			valor = salario * 0.5;
			novoSalario = salario + valor;
			cargo = "Escriturário";
			break;
		case 2:
			valor = salario * 0.35;
			novoSalario = salario + valor;
			cargo = "Escriturário";
			break;
		case 3:
			valor = salario * 0.2;
			novoSalario = salario + valor;
			cargo = "Escriturário";
			break;
		case 4:
			valor = salario * 0.1;
			novoSalario = salario + valor;
			cargo = "Escriturário";
			break;
		case 5:
			valor = 0.0;
			novoSalario = salario + valor;
			cargo = "Escriturário";
			break;
		}
		System.out.println("Cargo: " + cargo + "\nAumento: " + valor + "\nNovo salário: " + novoSalario);

		sc.close();

	}

}
