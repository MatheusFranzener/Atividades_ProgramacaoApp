import java.util.Scanner;

public class questao_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora, minuto;

		System.out.println("Informe as horas: ");
		hora = sc.nextInt();
		System.out.println("Informe os minutos: ");
		minuto = sc.nextInt();

		int minutos = minuto + (hora * 60);
		int totalMinutos = minuto + minutos;
		int segundos = totalMinutos * 60;

		System.out.println(
				"Hora em minutos: " + minutos + "\nTotal minutos: " + totalMinutos + "\nTotal segundos: " + segundos);

		sc.close();

	}

}
