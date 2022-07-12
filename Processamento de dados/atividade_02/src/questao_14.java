import java.util.Scanner;

public class questao_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pesoKg, qtdGato, pesoG;

		System.out.println("Informe a quantidade de kilos do saco: ");
		pesoKg = sc.nextDouble();
		System.out.println("Informe a quantidade do gato 1: ");
		qtdGato = sc.nextDouble();

		pesoG = pesoKg * 1000;
		qtdGato = 5 * (qtdGato * 2);
		pesoG = pesoG - qtdGato;

		System.out.println("Quantidade restante em gramas: " + pesoG);

		sc.close();

	}

}
