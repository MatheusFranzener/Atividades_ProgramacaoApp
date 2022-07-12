import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numero = sc.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		System.out.println("Sucessor: " + sucessor + "\nAntecessor: " + antecessor);

		sc.close();

	}

}
