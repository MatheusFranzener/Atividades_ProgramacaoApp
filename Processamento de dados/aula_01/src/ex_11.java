import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		System.out.println("Informe seu enderešo: ");
		String endereco = sc.next();
		System.out.println("Informe seu telefone: ");
		String telefone = sc.next();

		System.out.println("\nNome: " + nome + "\nEnderešo: " + endereco + "\nTelefone: " + telefone);
		
		sc.close();

	}

}
