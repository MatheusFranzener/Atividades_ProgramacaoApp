import java.util.Scanner;

public class q_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código do produto (1 - 10): ");
		int cod = sc.nextInt();
		System.out.println("Informe o peso do produto (KG): ");
		double peso = sc.nextDouble();
		System.out.println("Informe o código do país de origem (1 - 3): ");
		int pais = sc.nextInt();

		double precoTotal = 0, imposto = 0, grama = 0, valorComImposto = 0;

		if (cod >= 1 && cod <= 4) {
			grama = peso * 1000;
			precoTotal = grama * 10;
		} else if (cod > 4 && cod <= 7) {
			grama = peso * 1000;
			precoTotal = grama * 25;
		} else if (cod > 7 && cod <= 10) {
			grama = peso * 1000;
			precoTotal = grama * 35;
		}

		switch (pais) {
		case 1:
			imposto = precoTotal * 0;
			valorComImposto = precoTotal + imposto;
			break;
		case 2:
			imposto = precoTotal * 0.15;
			valorComImposto = precoTotal + imposto;
			break;
		case 3:
			imposto = precoTotal * 0.25;
			valorComImposto = precoTotal + imposto;
			break;
		}

		System.out.println("Peso do produto: " + peso + "\nPreço total: " + precoTotal + "\nValor do imposto: "
				+ imposto + "\nPreço total com imposto: " + valorComImposto);

		sc.close();
	}

}
