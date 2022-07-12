import java.util.Scanner;

public class q_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double peso = 0, altura = 0, mediaI = -0, somaMedia = 0, somaAltura = 0, mediaAltura = 0, porcentagem = 0;
		int idade = 0, inferior18 = 0, qnt80 = 0;

		for (int i = 1; i < 3; i++) {
			for (int a = 0; a < 11; a++) {
				System.out.println("Time: "+i);
				System.out.println("Jogador: " + a + "\nInforme sua idade: ");
				idade = sc.nextInt();
				if (idade < 18) {
					inferior18++;
				}
				somaMedia += idade;
				System.out.println("Informe o peso: ");
				peso = sc.nextDouble();
				if (peso > 80) {
					qnt80++;
				}
				System.out.println("Informe a altura: ");
				altura = sc.nextDouble();
				somaAltura += altura;

			}
			mediaI = somaMedia / 11;
			System.out.println("A média do Time " + i + " é: " + mediaI);
		}

		mediaAltura = somaAltura / 22;
		porcentagem = (qnt80 / 22) * 100;

		System.out.println("Quantidade de jogares com idade inferior a 18 anos: " + inferior18 + "\nMédia das alturas: "
				+ mediaAltura + "\nPorcentagem de jogadores com mais de 80kg: " + porcentagem);

		sc.close();

	}

}
