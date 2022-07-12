import java.util.Scanner;

public class questao_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Informe um número de 1-10: ");
		num = sc.nextInt();

		System.out.println("---TABUADA---");
		System.out.println("1 x " + "num: " + num * 1);
		System.out.println("2 x " + "num: " + num * 2);
		System.out.println("3 x " + "num: " + num * 3);
		System.out.println("4 x " + "num: " + num * 4);
		System.out.println("5 x " + "num: " + num * 5);
		System.out.println("6 x " + "num: " + num * 6);
		System.out.println("7 x " + "num: " + num * 7);
		System.out.println("8 x " + "num: " + num * 8);
		System.out.println("9 x " + "num: " + num * 9);
		System.out.println("10 x " + "num: " + num * 10);

		sc.close();

	}

}
