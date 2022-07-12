import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a base: ");
		double base = sc.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = (base * 2) + (altura * 2);
		System.out.println("Área: " + area + "\nPerímetro: " + perimetro);

		sc.close();

	}

}
