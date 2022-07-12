import java.util.Scanner;

public class questao_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco, resultado;

		System.out.println("Informe o preço do produto: ");
		preco = sc.nextDouble();

		resultado = preco * 0.90;

		System.out.println("Novo preço: " + resultado);

		sc.close();

	}

}
