import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--- PRIMEIRA DATA --- \nDia: ");
		int dia = sc.nextInt();
		System.out.println("Mês: ");
		int mes = sc.nextInt();
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		System.out.println("--- SEGUNDA DATA --- \nDia: ");
		int dia2 = sc.nextInt();
		System.out.println("Mês: ");
		int mes2 = sc.nextInt();
		System.out.println("Ano: ");
		int ano2 = sc.nextInt();

		String data1 = dia + "/" + mes + "/" + ano;
		String data2 = dia2 + "/" + mes2 + "/" + ano2;

		if (ano > ano2) {
			System.out.println("\n Data: " + data1);
		} else if (ano2 > ano) {
			System.out.println("\n Data: " + data2);
		} else {
			if (mes > mes2) {
				System.out.println("\n Data: " + data1);
			} else if (mes2 > mes) {
				System.out.println("\n Data: " + data2);
			} else {
				if (dia > dia2) {
					System.out.println("\n Data: " + data1);
				} else if (dia2 > dia) {
					System.out.println("\n Data: " + data2);
				} else {
					System.out.println("\nDatas iguais!");
				}
			}
		}

		sc.close();

	}
}
