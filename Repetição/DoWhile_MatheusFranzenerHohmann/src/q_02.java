import java.util.Scanner;

public class q_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0, codigoCidade = 0, codigoMaior = 0, codigoMenor = 0;
		double veiculos = 0, acidentes = 0, indice = 0, maiorAcidente = 0, menorAcidente = 99999, mediaVeiculos = 0,
				media2000 = 0, qntCarros2000 = 0, qntAcidentes2000 = 0, qntVeiculos = 0;

		do {
			System.out.println("Informe o c�digo da cidade: ");
			codigoCidade = sc.nextInt();
			System.out.println("Informe o n�mero de ve�culos de passeio: ");
			veiculos = sc.nextInt();
			qntVeiculos += veiculos;
			System.out.println("Informe o n�mero de acidentes com v�timas: ");
			acidentes = sc.nextInt();

			if (qntVeiculos < 2000) {
				qntCarros2000 += veiculos;
				qntAcidentes2000 += acidentes;
			}

			indice = veiculos / acidentes;

			if (indice > maiorAcidente) {
				maiorAcidente = indice;
				codigoMaior = codigoCidade;
			}

			if (indice < menorAcidente) {
				menorAcidente = indice;
				codigoMenor = codigoCidade;
			}

			contador++;
		} while (contador <= 4);

		mediaVeiculos = qntVeiculos / 5;
		media2000 = qntCarros2000 / qntAcidentes2000;

		System.out.println("Maior �ndice de acidentes: " + maiorAcidente + "  Seu c�digo: " + codigoMaior
				+ "\nMenor �ndice de acidentes: " + menorAcidente + "  Seu c�digo: " + codigoMenor
				+ "\nM�dia dos ve�culos: " + mediaVeiculos + "\nM�dia das cidades com menos de 2000 ve�culos: "
				+ media2000);

		sc.close();

	}

}
