import java.util.Scanner;

public class q_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número para a tabuada: (1-10): ");
		int numeroT = sc.nextInt();

		for (int i = 10; i > 0; i--) {
			int resultado = numeroT * i;
			System.out.println(i + "X" + numeroT + " = " + resultado);
		}

		sc.close();

	}

}
