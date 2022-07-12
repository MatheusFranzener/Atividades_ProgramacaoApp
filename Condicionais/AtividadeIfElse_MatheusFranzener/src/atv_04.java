import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaDuracao = 0, minDuracao = 0;

		System.out.println("Tempo de início \nHora: ");
		int hora1 = sc.nextInt();
		System.out.println("Minuto: ");
		int min1 = sc.nextInt();
		System.out.println("Tempo de término: \nHora: ");
		int hora2 = sc.nextInt();
		System.out.println("Minuto: ");
		int min2 = sc.nextInt();

		if (hora1 < hora2) {
			horaDuracao = hora2 - hora1;
		} else if (hora2 < hora1) {
			horaDuracao = 24 - (hora1 - hora2);
		}

		if (min1 < min2) {
			minDuracao = min2 - min2;
		} else if (min2 < min1) {
			minDuracao = 60 - (min1 - min2);
		}

		System.out.println("Duração: " + horaDuracao + " h " + minDuracao + " min");
		sc.close();

	}

}
