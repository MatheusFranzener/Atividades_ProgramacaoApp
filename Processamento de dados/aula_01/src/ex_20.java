import java.util.Scanner;

public class ex_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de anos: ");
		int anos = sc.nextInt();
		System.out.println("Informe a quantidade de meses: ");
		int meses = sc.nextInt();
		System.out.println("Informe a quantidade de dias: ");
		int dias = sc.nextInt();

		int diaAno = anos * 365;
		int diaMeses = meses * 30;
		int diasTotais = diaAno + diaMeses + dias;

		System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias = " + diasTotais);

		sc.close();

	}

}
