import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a base:");
		double base = sc.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = sc.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("Área: " + area);

		sc.close();
	}

}
