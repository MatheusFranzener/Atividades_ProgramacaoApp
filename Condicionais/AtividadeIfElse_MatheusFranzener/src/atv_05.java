import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double novoSalario = 0, valorAumento = 0;

		System.out.println("Informe o código: ");
		int codigo = sc.nextInt();
		System.out.println("Informe o salário atual: ");
		double salario = sc.nextDouble();

		if (codigo == 1) {
			novoSalario = salario * 1.5;
			valorAumento = salario * 0.5;
			System.out.println("Código: " + codigo + "\nCargo: Escrituário \nValor aumento: " + valorAumento
					+ "\nNovo salário: " + novoSalario);
		} else if (codigo == 2) {
			novoSalario = salario * 1.35;
			valorAumento = salario * 0.35;
			System.out.println("Código: " + codigo + "\nCargo: Secretário \nValor aumento: " + valorAumento
					+ "\nNovo salário: " + novoSalario);
		} else if (codigo == 3) {
			novoSalario = salario * 1.2;
			valorAumento = salario * 0.2;
			System.out.println("Código: " + codigo + "\nCargo: Caixa \nValor aumento: " + valorAumento
					+ "\nNovo salário: " + novoSalario);
		} else if (codigo == 4) {
			novoSalario = salario * 1.1;
			valorAumento = salario * 0.1;
			System.out.println("Código: " + codigo + "\nCargo: Gerente \nValor aumento: " + valorAumento
					+ "\nNovo salário: " + novoSalario);
		} else if (codigo == 5) {
			System.out.println("Código: " + codigo + "\nCargo: Diretor \nValor aumento: Não Possui valor de aumento!"
					+ "\nSalário: " + salario);
		}

		sc.close();

	}

}
