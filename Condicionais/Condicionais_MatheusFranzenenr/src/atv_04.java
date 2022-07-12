import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Informe o terceiro número: ");
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("3- " + num1 + "\n2- " + num2 + "\n1- " + num3);
		} 
		if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("3- " + num1 + "\n2- " + num3 + "\n1- " + num2);
		} 
		if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("3- " + num2 + "\n2- " + num1 + "\n1- " + num3);
		} 
		if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("3- " + num2 + "\n2- " + num3 + "\n1- " + num1);
		} 
		if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("3- " + num3 + "\n2- " + num1 + "\n1- " + num2);
		} 
		if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("3- " + num3 + "\n2- " + num2 + "\n1- " + num1);
		}

		sc.close();

	}

}
