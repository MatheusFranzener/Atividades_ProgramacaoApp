import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		System.out.println("Informe seu endere�o: ");
		String endereco = sc.next();
		System.out.println("Informe seu telefone: ");
		String telefone = sc.next();

		System.out.println("\nNome: " + nome + "\nEndere�o: " + endereco + "\nTelefone: " + telefone);
		
		sc.close();

	}

}
