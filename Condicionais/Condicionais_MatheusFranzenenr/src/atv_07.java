import java.util.Scanner;

public class atv_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor I: ");
		double valorI = sc.nextDouble();
		System.out.println("Informe o valor de A: ");
		double valorA = sc.nextDouble();
		System.out.println("Informe o valor de B: ");
		double valorB = sc.nextDouble();
		System.out.println("Informe o valor de C: ");
		double valorC = sc.nextDouble();

		if (valorI == 1) {
			if (valorA > valorB && valorA > valorC && valorB > valorC) {
				System.out.println("3- " + valorA + "\n2- " + valorB + "\n1- " + valorC);
			}
			if (valorA > valorB && valorA > valorC && valorC > valorB) {
				System.out.println("3- " + valorA + "\n2- " + valorC + "\n1- " + valorB);
			}
			if (valorB > valorA && valorB > valorC && valorA > valorC) {
				System.out.println("3- " + valorB + "\n2- " + valorA + "\n1- " + valorC);
			}
			if (valorB > valorA && valorB > valorC && valorC > valorA) {
				System.out.println("3- " + valorB + "\n2- " + valorC + "\n1- " + valorA);
			}
			if (valorC > valorA && valorC > valorB && valorA > valorB) {
				System.out.println("3- " + valorC + "\n2- " + valorA + "\n1- " + valorB);
			}
			if (valorC > valorA && valorC > valorB && valorB > valorA) {
				System.out.println("3- " + valorC + "\n2- " + valorB + "\n1- " + valorA);
			}
		}

		if (valorI == 2) {
			if (valorA > valorB && valorA > valorC && valorB > valorC) {
				System.out.println("1- " + valorA + "\n2- " + valorB + "\n3- " + valorC);
			}
			if (valorA > valorB && valorA > valorC && valorC > valorB) {
				System.out.println("1- " + valorA + "\n2- " + valorC + "\n3- " + valorB);
			}
			if (valorB > valorA && valorB > valorC && valorA > valorC) {
				System.out.println("1- " + valorB + "\n2- " + valorA + "\n3- " + valorC);
			}
			if (valorB > valorA && valorB > valorC && valorC > valorA) {
				System.out.println("1- " + valorB + "\n2- " + valorC + "\n3- " + valorA);
			}
			if (valorC > valorA && valorC > valorB && valorA > valorB) {
				System.out.println("1- " + valorC + "\n2- " + valorA + "\n3- " + valorB);
			}
			if (valorC > valorA && valorC > valorB && valorB > valorA) {
				System.out.println("1- " + valorC + "\n2- " + valorB + "\n3- " + valorA);
			}
		}

		if (valorI == 3) {
			if (valorA > valorB && valorA > valorC) {
				System.out.println("1- " + valorB + "\n2- " + valorA + "\n3- " + valorC);
			}
			if (valorB > valorA && valorB > valorC) {
				System.out.println("1- " + valorA + "\n2- " + valorB + "\n3- " + valorC);
			}
			if (valorC > valorA && valorC > valorB) {
				System.out.println("1- " + valorA + "\n2- " + valorC + "\n3- " + valorB);
			}
		}

		sc.close();

	}

}
