import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o raio: ");
		double raio = sc.nextDouble();
		double area = 3.14 * (raio * raio);
		double perimetro = (2 * 3.14) * raio;
		System.out.println("Área: " + area + "\nPerímetro: " + perimetro);

		sc.close();
	}

}
