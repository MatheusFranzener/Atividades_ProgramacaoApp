import java.util.Scanner;

public class questao_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double dinheiro, dolar, euro, libra;

		System.out.println("Informe o dinheiro para a viagem: ");
		dinheiro = sc.nextDouble();

		dolar = dinheiro / 4.97;
		euro = dinheiro / 5.23;
		libra = dinheiro / 6.25;

		System.out.println("Dolar: " + dolar + "\nEuro: " + euro + "\nLibra esterlina: " + libra);

		sc.close();

	}

}
