import java.util.Scanner;

public class q_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMin = 1200, salario = 0, folhaPagamento = 0, maiorSalario = 0, mediaF = 0, mediaH = 0;
		int h = 0, f = 0, qntP = 0, pecasH = 0, pecasF = 0, numeroMaior = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.println("Informe o n�mero do oper�rio: " + i);
			int numero = sc.nextInt();
			System.out.println("N�mero de pe�as fabricadas: ");
			int pecas = sc.nextInt();
			qntP+=pecas;
			System.out.println("Informe seu sexo (1-M) (2-F): ");
			int sexo = sc.nextInt();

			if (sexo == 1) {
				h++;
				pecasH += pecas;
			} else {
				f++;
				pecasF += pecas;
			}

			if (pecas <= 30) {
				salario = salarioMin;
			} else if (pecas > 30 && pecas <= 50) {
				salario = salarioMin + ((pecas - 30) * (salarioMin * 0.03));
			} else if (pecas > 50) {
				salario = salarioMin + ((pecas - 30) * (salarioMin * 0.05));
			}

			if (salario > maiorSalario) {
				maiorSalario = salario;
				numeroMaior = numero;
			}

			folhaPagamento += salario;

			System.out.println("N�mero do oper�rio: " + numero + "\nSal�rio: " + salario);

		}

		mediaF = pecasF / f;
		mediaH = pecasH / h;

		System.out.println(
				"Folha de pagamento: " + folhaPagamento + "\nPe�as fabricadas no m�s: " + qntP + "\nM�dia dos homens: "
						+ mediaH + "\nM�dia das mulheres: " + mediaF + "\nN�mero do maior sal�rio: " + numeroMaior);

		sc.close();

	}

}
