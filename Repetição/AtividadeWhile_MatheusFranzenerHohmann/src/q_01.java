import java.util.Scanner;

public class q_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int meses = 0;

		System.out.println("Informe o salário de Carlos: ");
		double salarioC = sc.nextDouble();

		double salarioJ = salarioC / 3;

		while (salarioC > salarioJ) {
			salarioC *= 1.02;
			salarioJ *= 1.05;
			meses++;
		}

		System.out.println("Quantidade de meses para igualar/ultrapassar o salário de Carlos: " + meses);

		sc.close();
	}

}
