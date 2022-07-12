import java.util.Scanner;

public class questao_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMin, salarioBruto, salarioExtra, salarioTotal;
		int horas, horasExtras;

		System.out.println("Informe o valor do salário mínimo: ");
		salarioMin = sc.nextDouble();
		System.out.println("Informe as horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Informe as horas extras trabalhadas: ");
		horasExtras = sc.nextInt();

		salarioBruto = horas * (salarioMin / 8);
		salarioExtra = horasExtras * (salarioMin / 4);
		salarioTotal = salarioBruto + salarioExtra;

		System.out.println("Salário atual: " + salarioTotal);

		sc.close();

	}

}
