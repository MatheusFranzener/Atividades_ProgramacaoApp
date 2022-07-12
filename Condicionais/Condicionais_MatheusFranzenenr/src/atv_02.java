import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7.0 && media <= 10.0) {
			System.out.println("Aprovado! \nMédia: " + media);
		}
		if (media >= 3.0 && media < 7.0) {
			System.out.println("Exame!");
			double mediaFinal = 12 - media;
			System.out.println("Nota para ser aprovado: " + mediaFinal);
		}
		if (media < 3.0) {
			System.out.println("Reprovado!");
		}

		sc.close();
	}

}
