import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = sc.nextDouble();

		double mediaP = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		if (mediaP >= 8.0 && mediaP <= 10.0) {
			System.out.println("Sua média foi: " + mediaP + "\nConceito: A");
		}
		if (mediaP >= 7.0 && mediaP < 8.0) {
			System.out.println("Sua média foi: " + mediaP + "\nConceito: B");
		}
		if (mediaP >= 6.0 && mediaP < 7.0) {
			System.out.println("Sua média foi: " + mediaP + "\nConceito: C");
		}
		if (mediaP >= 5.0 && mediaP < 6) {
			System.out.println("Sua média foi: " + mediaP + "\nConceito: D");
		}
		if (mediaP < 5.0) {
			System.out.println("Sua média foi: " + mediaP + "\nConceito: E");
		}

		sc.close();
	}

}
