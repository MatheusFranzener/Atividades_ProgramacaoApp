import java.util.Scanner;

public class questao_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, vendas, comissao;

		System.out.println("Informe seu sal�rio: ");
		salario = sc.nextDouble();
		System.out.println("Informe o valor das vendas: ");
		vendas = sc.nextDouble();

		comissao = vendas * 0.04;
		salario = salario + comissao;

		System.out.println("Novo sal�rio: " + salario);

		sc.close();
	}

}
